package juros;

import static java.lang.Math.pow;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Nicolas
 */
public class Dados 
{
    private double c = 0.00;
    private double i = 0.00;
    private double T = 0;
    private double m = 0.00;
  
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     *
     */
    public void DAD()
  {
        
  }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the i
     */
    public double getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(double i) {
        this.i = i;
    }

    /**
     * @return the T
     */
    public double getT() {
        return T;
    }

    /**
     * @param T the T to set
     */
    public void setT(double T) {
        this.T = T;
    }
    
    public void cadastrarDados()
  {
    try 
    {
      this.setC(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu depósito inicial: ")));
    } 
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"DEPÓSITO\"\nDETALHE: " + e);
      System.exit(0);
    }

    try
    {
      this.setI(Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de remuneração sem a %(ex: 0.01 para 1%): ")));
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar a \"JUROS\"\nDETALHE: " + e);
      System.exit(0);
    }
    
    try
    {
      this.setT(Double.parseDouble(JOptionPane.showInputDialog("Digite o número de meses: ")));
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"MESES\"\nDETALHE: " + e);
      System.exit(0);
    }
    
    m = c * pow((1 + i),T);
    
  }
    
    public void exibirDados()
  {
    try
    {
      System.out.println("Exibindo dados...");
      JOptionPane.showMessageDialog(null, "O seu saldo é equivalente a: R$ " + m + ".");      
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao exibir os dados.\nDETALHE: " + e);
      System.exit(0);
    }
  }
}


