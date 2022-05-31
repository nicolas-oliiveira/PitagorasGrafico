package calculadora_;

import javax.swing.JOptionPane;

/**
 *
 * @author a22273
 */
public class Calculadora_
{
    
    static double n1;
    static double n2;
    static double res;
    static int tipodeconta;
    
    public static void main(String[] args) 
    {    
        tipodeconta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número referente ao cálculo desejado " 
            + "1 -> Soma" + "\n"
            + "2 -> Subtração" + "\n"
            + "3 -> Divisão" + "\n"
            + "4 -> Multiplicação" + "\n"
            + "5 -> Resto da Divisão" + "\n"
            + "6 -> Dobro" + "\n"
            + "7 -> Quadrado" + "\n"
            + "8 -> Cubo" + "\n"
            + "9 -> Raiz Quadrada" + "\n"
            + "0 -> Sair"));
        
        if(tipodeconta != 0)
        {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número para realizar o calculo: "));
        }
        
        
        switch(tipodeconta)
        {
            case 0 : Sair();
            
            case 1 : Soma();
            
            case 2 : Subtracao();
            
            case 3 : Divisao();
            
            case 4 : Multiplicacao();
            
            case 5 : RestodaDivisao();
            
            case 6 : Dobro();
            
            case 7 : Quadrado();
            
            case 8 : Cubo();
            
            case 9 : RaizQuadrada();
            break;
        }
    }
     
    public static void Soma()
    {
        if(tipodeconta == 1)
        {
            res = n1 + n2;
            JOptionPane.showMessageDialog(null, "O resultado é: " +res);
        }
    }
    
    public static void Subtracao()
    {
        if(tipodeconta == 2)
        {
            res = n1 - n2;
            JOptionPane.showMessageDialog(null, "O resultado é: " +res);
        }
    }
        
    public static void Divisao()
    {
        if(tipodeconta == 3)
        {
            res = n1 / n2;
            JOptionPane.showMessageDialog(null, "O resultado é: " +res);
        }
    }
        
    public static void Multiplicacao()
    {
        if(tipodeconta == 4)
        {
            res = n1 * n2;
            JOptionPane.showMessageDialog(null, "O resultado é: " +res);
        }
    }
        
    public static void RestodaDivisao()
    {
        if(tipodeconta == 5)
        {
            res = n1 % n2;
            JOptionPane.showMessageDialog(null, "O resultado é: " +res);
        }
    }
        
    public static void Dobro()
    {
        if(tipodeconta == 6)
        {
            res = n1 * 2;
            JOptionPane.showMessageDialog(null, "O resultado do dobro do primeiro número é: " +res);
            res = n2 * 2;
            JOptionPane.showMessageDialog(null, "O resultado do dobro do segundo número é: " +res);
        }
    }
        
    public static void Quadrado()
    {
        if(tipodeconta == 7){
            res = n1 * n1;
            JOptionPane.showMessageDialog(null, "O resultado ao quadrado do primeiro número é: " +res);
            res = n2 * n2;
            JOptionPane.showMessageDialog(null, "O resultado ao quadrado do segundo número é: " +res);
        }
    }
        
    public static void Cubo()
    {
        if(tipodeconta == 8)
        {
            res = n1 * n1 * n1;
            JOptionPane.showMessageDialog(null, "O resultado ao cubo do primeiro número é: " +res);
            res = n2 * n2 * n2;
            JOptionPane.showMessageDialog(null, "O resultado ao cubo do segundo número é: " +res);
        } 
    }
        
    public static void RaizQuadrada()
    {
        if(tipodeconta == 9)
        {
            res = Math.sqrt(n1);
            JOptionPane.showMessageDialog(null, "A raiz quadrada do primeiro número é: " +res);
            res = Math.sqrt(n2);
            JOptionPane.showMessageDialog(null, "A raiz quadrada do segundo número é: " +res);
        }
    }
    
    public static void Sair()
    {
        if(tipodeconta == 0)
        {
            JOptionPane.showMessageDialog(null, "Fim do Programa.");
        }
        
    }
    
           
}
