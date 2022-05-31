package media_aluno;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author a22273
 */
public class Media_aluno {
    
     public static String Nome;
    public static double NT1;
    public static double NT2;
    public static double MD;

    public static void LerNota()
    {
        Nome = JOptionPane.showInputDialog(null, "Por favor insira seu nome:");
        NT1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor insira sua primeira nota:"));
        NT2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor insira sua segunda nota:"));
    }
    
    public static void CalcMedia(){
        MD =  (NT1+NT2)/2;
        
        if(MD >=7 && MD<=10) {
            JOptionPane.showMessageDialog(null,  Nome+ "Sua nota é: " +MD+ " você foi aprovado");
                
           
        }
        else if (MD >= 0 && MD <6) {
            JOptionPane.showMessageDialog(null, Nome+ " Sua nota é: " +MD+ " Você não foi aprovado.");
            
        }

    }
    public static void main(String[] args) {

        LerNota();
        CalcMedia();
        
    }
    
}
