package bsaltrta;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class BsAltRta {

    public static double  B = 0.00;
    public static double AR = 0.00;
    public static double A = 0.00;
    public static DecimalFormat df = new DecimalFormat("0.00");
    
    public static Scanner entrada = new Scanner(System.in);
    
    
    
    public static void main(String[] args) 
    {
        
        System.out.println();
        System.out.print("Digite a base do retângulo: ");
        B = entrada.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        A = entrada.nextDouble();
        
        AR = B * A;
        
        //Exibindo dados
        
        System.out.println("A sua área é: " +AR);
        
        
    }
    
}
