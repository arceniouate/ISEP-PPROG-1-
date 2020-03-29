/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *Esta classe permite a contreucao de uma hearquia de todas as classes 
 * para represntar os diferentes tipos de  contribuintes.Especificando os menbros 
 * comuns de todas as classes
 * @author arccenio
 */
public  abstract  class Contribuintes {
    /**
     * nome do cotrubuinte 
     */
    private String nome ;
    private  String morada;

    public Contribuintes() {
        this.nome="";
        this.morada="";
    }

    public Contribuintes(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
    @Override
   public String  toString (){
        return String.format("Nome : %s ","Morada : %s")
                +nome
                +morada;
       
   }
   abstract double calcularRO();
}
