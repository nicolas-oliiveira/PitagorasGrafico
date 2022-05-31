package juros03;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Nicolas
 */
public class Juros03 
{
    public static double C = 0.00;
    public static double t = 0;
    public static double i = 0.01;
    public static double M = 0.00;
    public static DecimalFormat df = new DecimalFormat("0.00");
    
    public static Scanner entrada = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.print("Por favor digite o seu depósito inicial: ");
        C = entrada.nextDouble();
        System.out.print("Agora, digite o a taxa de juros: ");
        i = entrada.nextDouble();
        System.out.print("Por fim, digite a quantidade de meses: ");
        t = entrada.nextDouble();
        
        //exibindo dados
        
        M = C * Math.pow((1+i),t);
        
        System.out.println("O resultado é: " +M);
    }
    
}
