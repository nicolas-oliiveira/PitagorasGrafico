package salário_li_bru;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Salário_li_bru {
    
    public static double SB;
    public static double SL;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SB = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, Digite seu sálario bruto: "));
        SL = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, Digite seu sálario liquido: "));
        
        SB = SB+(0.1*SB);
        JOptionPane.showMessageDialog(null, "Sua gratificação é de: " +SB);
        
        
        SB = SB+(0.1*SB);
	SB = SB - (0.2*SB);
        JOptionPane.showMessageDialog(null, "O valor do imposto  é :" +SB);
        
        SL = SB - (0.1*SB);
        JOptionPane.showMessageDialog(null, "O valor do salário líquido  é: " +SL);

        // TODO code application logic here
    }
    
}
