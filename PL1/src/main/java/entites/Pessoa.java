/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author arccenio
 */
public class Pessoa {
    private String  nome ;
    private int idade;

    
    public Pessoa(){
        
    }
    /**
     * contrutor com parametros
     * @param nome
     * @param idade 
     */
    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }
    /**
 * Acessor da nome 
 * @return 
 */
    public String getNome() {
        return nome;
    }
    /**
 * Acessor da nome
 * @return 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * Acessor da idade 
 * @return 
 */
    public int getIdade() {
        return idade;
    }
    
/***
 * modificador de acessso da idade
 * @param idade 
 */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString(){
        return nome 
                +" tem "
                +idade;
    }
    
}
