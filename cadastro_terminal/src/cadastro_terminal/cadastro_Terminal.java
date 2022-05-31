package Cadastro_terminal;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class cadastro_Terminal 
{
    
    public static String nome = "";
    public static String sobreNome = "";
    public static int idade = 0;
    public static boolean fumante = false;
    public static int opcao = 0;
    public static double renda = 0.00;
    public static DecimalFormat df = new DecimalFormat("0.00");
    
    public static Scanner entrada = new Scanner(System.in);
    
    /*
     * @param args the command line arguments
     */  
    public static void main(String[] args) 
    {
        System.out.println("Iniciando o programa de cadastro!");
        System.out.print("Digite o seu primeiro nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite o seu ultimo nome: ");
        sobreNome = entrada.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Digite 1 para fumante ou 0 para não fumante: ");
        opcao = entrada.nextInt();
        
        if (opcao == 1)
        {
            fumante = true;
        }
        else
        {
            fumante = false;
        }
        
        System.out.print("Digite a sua renda (use , para separar a parte decimal: ");
        renda = entrada.nextDouble();
        
        System.out.println("");
        System.out.println("");
        
        // Exibindo os dados:
        
        System.out.println("Dados Cadastrados...");
        System.out.println("Nome Completo: " + nome + " " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Fumante: " + fumante);
        System.out.println("Digite sua renda mensal: " + df.format(renda).toString());
        System.out.println("");
        System.out.println("Fim do programa!"); // TODO code application here
        
    }
    
}