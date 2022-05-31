package Lanches;

import java.util.Scanner;
/**
 *
 * @author Nicolas
 */
public class Main 
{

    private int lanche = 0;
    //Numero do lanche.
    private Scanner leia = new Scanner(System.in);
    
    public void Main()
    {
        
    }

    /**
     * @return the lanche
     */
    public int getLanche() {
        return lanche;
    }

    /**
     * @param lanche the lanche to set
     */
    public void setLanche(int lanche) {
        this.lanche = lanche;
    }

    /**
     * @return the leia
     */
    public Scanner getLeia() {
        return leia;
    }

    /**
     * @param leia the leia to set
     */
    public void setLeia(Scanner leia) {
        this.leia = leia;
    }
    
    
    public void ExibirDados()
    {
        System.out.print("Por favor, Digite um número de 1 á 5 para receber o"
                           +"nome de um lanche ser apresentado: ");
        lanche = leia.nextInt();
        
        switch(lanche){
            case 1:
                System.out.println("BigMac");
                break;
            case 2:
                System.out.println("Quarteirão");
                break;
            case 3:
                System.out.println("MacChicken");
                break;
            case 4:
                System.out.println("ChedarMecmelt");
            case 5:
                System.out.println("MacMax");
                break;
        }
    }
}

