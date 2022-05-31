package padrao;

import util.Pessoa;

/**
 *
 * @author Nicolas
 */
public class Aluno extends Pessoa
{
   private int rm = 0; 
   
   public void Aluno()
   {
       
   }
   
   /**
    *  @return the rm
    */
   public int getRm()
   {
       return rm;
   }
   
   /**
    *  @param rm the rm to set
    */
   public void setRm(int rm)
   {
       this.rm = rm;
   }
   
   
   public void exibirRgm()
   {
       System.out.println("RM: " + this.getRm());
   }
   /*
   @Override
   public void exibirDados()
   {
     System.out.println("Dados de uma pessoa...");
     System.out.println("Nome: " + this.getNome());
     System.out.println("Idade: " + this.getIdade());
     System.out.println("Sexo: " +this.isSexo());
     System.out.println("RM: " + this.getRM());
   }
   
   */
   
}