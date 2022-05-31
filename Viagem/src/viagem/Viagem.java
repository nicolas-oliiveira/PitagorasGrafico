package viagem;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Viagem {
    
    public static double horas;
    public static double velo;
    public static double dist;
    public static double cons = 12;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        horas = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira o tempo gasto na viagem em horas: "));
        
        velo = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira a velocidade média em km/h: "));
        
        dist = horas*velo;
        cons = (dist / cons);
        
        JOptionPane.showMessageDialog(null, "O consumo em em litros foi: " +cons);
        JOptionPane.showMessageDialog(null, "A distância percorrida em kh/h foi: " +dist);
    }
    
}
