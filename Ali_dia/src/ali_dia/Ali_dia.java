package ali_dia;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Nicolas
 */
public class Ali_dia {
    
    public static double KG;
    public static double Dias;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        KG = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, Digite a quantidade de comidas em quilos: "));
        
        Dias = (KG*1000)/50;
        
        JOptionPane.showMessageDialog(null, "Sua comida irá durar: " +Dias+ " Dias");
        // TODO code application logic here
    }
    
}
