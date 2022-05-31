package util;

/**
 *
 * @author Nicolas
 */

public class Pessoa 
{
    //Declaração de variáveis
    
    //nome da pessoa
    private String nome = "";
    //Idade da pessoa
    private int idade = 0;
    //sexo da pessoa; (Masculino = true Feminino = false)
    private boolean sexo = false;

    public void Pessoa()
    {
        
    }

/**
 *@return the nome
 */
public String getNome()
{
    return nome;
}

/**
 * @param nome the nome to set;
 */
public void setNome(String nome)
{
    this.nome = nome;
}

/**
 *  @return the idade
 */
public int getIdade()
{
    return idade;
}

/**
 *  @param idade the idade to set
 */
public void setIdade(int Idade)
{
    this.idade = idade;
}

/**
 *  @return the sexo
 */
public boolean isSexo ()
{
    return sexo;
}

/**
 *  @param sexo the sexo to set
 */
public void setSexo(boolean sexo)
{
    this.sexo = sexo;
}

public void Falar()
{
    System.out.println("Se penso, logo existo!");
}

public void exibirDados()
{
    System.out.println("Dados de uma pessoa...");
    System.out.println("Nome: " +this.getNome());
    System.out.println("Idade: " +this.getIdade());
    System.out.println("Sexo: " +this.isSexo());
}

}
