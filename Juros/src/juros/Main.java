package juros;

import juros.Dados;

/**
 *
 * @author Nicolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        Dados dados = new Dados();
        
        dados.cadastrarDados();
        
        dados.exibirDados();
    }
    
}
