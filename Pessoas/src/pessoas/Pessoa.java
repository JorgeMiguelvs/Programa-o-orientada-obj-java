/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

/**
 *
 * @author jorge.mvsilva1
 */
public class Pessoa {
     
    public Pessoa(String nome, int idade)
    {
        this.nome=nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, char sexo)
    {
        this.nome = nome;
        this.idade = idade;
        
    }
    
    String nome ;
    int idade ;
    char sexo;

    public String imprimir(){
        return  "Pessoa{"+ "nome=" + nome + ", idade=" + idade + ",sexo=" + sexo + '}';
    }
}
