package raio;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Nicolas
 */
public class Raio {

    public static double R = 0.00;
    public static double C = 0.00;
    public static double A = 0.00;
    
    public static DecimalFormat df = new DecimalFormat("0.00");
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.print("Por favor, digite o Raio da circunferência: ");
        R = entrada.nextDouble();
        
        C = 2 * 3.14 * R ;  
        A = 3.14 * (Math.pow(R,2));
        
    }
    
}
