/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    int e = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, digite o número referente à sua escolha: "
            + "1 - soma"
            + "2 - Subtração"
            + "3 - Divisão"
            + "4 - Multiplição"
            + "5 - Resto de Divisão"
            + "6 - Dobro"
            + " 7 - Quadrado"
            + "8 - Cubo"
            + "9 - Raiz Quadrada"
            + "0 - Sair"));
    
    

    private float calculadora(int e) {
        float r = 0;
        float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        switch(e)
        {
            case 1 : r = n1+n2; break;
            case 2 : r = n1-n2; break;
            case 3 : r = n1/n2; break;
            case 4 : r = n1*n2; break;
            case 5 : r = n1%n2 ; break;
            case 6 : r = n1+n1; break;
            case 7 : r = n1*n1; break;
            case 8 : r = n1*n1*n1; break;
            case 9 : r = (float) Math.sqrt(n1); break;
            case 0 : r = 0; break;
        }
        return r;
    }
}
   
