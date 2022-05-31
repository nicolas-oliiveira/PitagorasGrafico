package trocar_valor;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Trocar_valor {
    
    public static double A;
    public static double B;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, Digite o valor de A: "));
        
        B = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, Digite o valor de B: "));
        
        JOptionPane.showMessageDialog(null, "O valor de A é:" +B);
        
        JOptionPane.showMessageDialog(null, "O valor de B é:" +A);
        
    }
    
}
