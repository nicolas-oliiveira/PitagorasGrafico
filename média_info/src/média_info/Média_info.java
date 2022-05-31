package média_info;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Média_info {
    
    public static double NT1;
    public static double NT2;
    public static double NT3;
    public static double NT4;
    public static double MD;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NT1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora por favor insira sua primeira nota:"));
        NT2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora por favor insira sua segunda nota:"));
        NT3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora por favor insira sua terceira nota:"));
        NT4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora por favor insira sua quarta nota:"));
        
        
        MD = (NT1 + NT2+NT3+NT4)/4;
        
        if(MD >=6) {
            JOptionPane.showMessageDialog(null, "Sua nota é: " +MD+  " parabéns você foi aprovado");
            JOptionPane.showMessageDialog(null, "Média >=6");
        }
        else if (MD <3) {
            JOptionPane.showMessageDialog(null, "Sua nota é: " +MD+ " Você não foi aprovado. ");
            JOptionPane.showMessageDialog(null, "Média <3");
        }
            
        if  (MD >=3 && MD<6 ) {
            JOptionPane.showMessageDialog(null, "Sua nota é: " +MD+  " Você ficou no exame. ");
            JOptionPane.showMessageDialog(null, "Média >=3 ou <6");
    }
        // TODO code application logic here
    }
    
}

