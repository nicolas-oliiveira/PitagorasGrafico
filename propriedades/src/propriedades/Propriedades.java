package propriedades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Propriedades {
    
    public static double A;
    public static double B;
    public static double C;
    public static double D;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira seu primeiro número :"));
        
        B = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira seu segundo número :"));
        
        C = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira seu terceiro número :"));
        
        D = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira seu quarto número :"));
        
        JOptionPane.showMessageDialog(null,  "O valor da soma de A com B é: "+ (A+B));
        JOptionPane.showMessageDialog(null,  "O valor da multiplicação de A com B é: "+ (A*B));
        
        JOptionPane.showMessageDialog(null,  "O valor da soma de A com C é: "+ (A+C));
        JOptionPane.showMessageDialog(null,  "O valor da multiplicação de A com C é: "+ (A*C));
        
        JOptionPane.showMessageDialog(null,  "O valor da soma de A com D é: "+ (A+D));
        JOptionPane.showMessageDialog(null,  "O valor da multiplicação de A com D é: "+ (A*D));
        
        JOptionPane.showMessageDialog(null,  "O valor da soma de B com C é: "+ (B+C));
        JOptionPane.showMessageDialog(null,  "O valor da multiplicação de B com C é: "+ (B*D));
        
        JOptionPane.showMessageDialog(null,  "O valor da soma de C com D é: "+ (C+D));
        JOptionPane.showMessageDialog(null,  "O valor da multiplicação de C com D é: "+ (C*D));
    }
    
}
