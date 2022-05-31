package mulinter;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class MUL 
{
    private double PQ = 0;
    private double EP = 0;
    private double Mul = 0;
  
  Scanner teclado = new Scanner(System.in);
  
    /**
     *
     */
    public void MUL()
  {
      
  }

    /**
     * @return the PQ
     */
    public double getPQ() {
        return PQ;
    }

    /**
     * @param PQ the PQ to set
     */
    public void setPQ(double PQ) {
        this.PQ = PQ;
    }

    /**
     * @return the Mul
     */
    public double getMul() {
        return Mul;
    }

    /**
     * @param Mul the Mul to set
     */
    public void setMul(double Mul) {
        this.Mul = Mul;
    }
    
    public void CadastrarDados()
  {
    try 
    {
      JOptionPane.showMessageDialog(null,"Iniciar Programa.");
      this.setPQ(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peixes em kg: ")));
      
        if (PQ> 50) 
        {
            EP = PQ - 50;
            Mul = EP * 4;
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Não há multa para o cliente.");
        }
    } 
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar a \"QUANTIDADE DE PEIXES\"\nDETALHE: " + e);
      System.exit(0);
    }

  }
    
    public void exibirDados()
  {
    try
    {
        JOptionPane.showMessageDialog(null, "O valor da multa é de: R$ " + Mul + ".");
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao exibir os dados.\nDETALHE: " + e); 
      System.exit(0);
    }
  }
}
