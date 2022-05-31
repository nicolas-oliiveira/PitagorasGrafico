package números_quadrados;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Números_quadrados {
    
    public static double N1;
    public static double N2;
    public static double N3;
    public static double res;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        N1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favoe, insira seu primeiro número: "));
        
        N2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favoe, insira seu segundo número: "));
        
        N3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favoe, insira seu terceiro número: "));
        
        res = (N1*N1)+(N2*N2)+(N3*N3);
        
        JOptionPane.showMessageDialog(null, "Seu resultado é: " +res);
        
        
        // TODO code application logic here
    }
    
}
