package padrao;

import padrao.Aluno;
/**
 *
 * @author Nicolas
 */
public class Principal 
{
   
    /**
     *  @param args the comand line arguments
     */
    
    
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno();
        
        aluno.Falar();
        
        aluno.setNome("Nicolas");
        
        aluno.setIdade(16);
        
        aluno.setSexo(true);
        
        aluno.setRm(40028922);
        
        aluno.exibirDados();
        
        aluno.exibirRgm();
        
    }
    
}
