package pres_atraso;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Nicolas
 */
public class Pres_atraso {
    
    public static double valor;
    public static double taxa;
    public static double Prestação;
    

    
    public static void main(String[] args) {
        
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, digite o valor da prestação: "));
        
        taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, digite a taxa de juros: "));
        
        Prestação = valor + (valor * taxa / 100);
        
        JOptionPane.showMessageDialog(null, "O valor da sua prestação em atraso é: " +Prestação);
        // TODO code application logic here
    }
    
}
