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
public class Utente {
    /**
     * nome do utente
     */
    private String nome;
    /***
     * genero do utente
     */
    private String genero;
    /***
     * idade  do utente
     */
    private int idade;
    /***
     * Altura do utente 
     */
    private double altura;
    /***
     * Peso do utente
     */
    private int peso;
 
    private final String NOMEOMISAO = "";
    private final String GENEROOMISSAO = "";
    private final int IDADEOMISSAO = 0;
    private final int PESOOMISSAO = 0;
    private final double ALTURAOMISAO = 0.0;
    private final int MAGRO=18;
    private final int  GORDO=25;
    /***
     * contrutor sem parametros com as variaveis inicializas a zerro
     */
    public Utente() {
        this.nome = NOMEOMISAO;
        this.genero = GENEROOMISSAO;
        this.idade = IDADEOMISSAO;
        this.peso = PESOOMISSAO;
        this.altura = ALTURAOMISAO;

    }
/****
 * COntri«utor completo com parametros
 * @param nome
 * @param genereo
 * @param idade
 * @param altura
 * @param peso 
 */
    public Utente(String nome, String genereo, int idade, double altura, int peso) {
        this.nome = nome;
        this.genero = genereo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
/***
 * Sobrecarga contrutor  com parametro que tem como objetivo a intanciacao da calsse com o nome e a is«dade 
 * @param nome
 * @param idade 
 */
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

  /***
   * Acessor do genero do utente 
   * @return 
   */  
    public String getGenero() {
        return genero;
    }
    /***
     * Acessor do nome do utente do ginagio
     * @return 
     */

    public String getNome() {
        return nome;
    }
/***
 * Modificador do nome 
 * @param nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/***
 * Acessor da idade 
 * @return 
 */
    public int getIdade() {
        return idade;
    }
    /***
     * Modificadeo r acesso da idade
     * @param idade 
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
/**
 * acessor da altura 
 * @return 
 */
    public double getAltura() {
        return altura;
    }
    /**
     * 
     * @param altura 
     */

    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * Acessor da altura do paciente
     * @return 
     */
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    } /***
     * determina a diferenca das idades
     * @param ages
     * @return diference
     */
    public int DiferentOfAges(Utente ag){
        int ages=getIdade();
        int ages1=ag.getIdade();
        return ages -ages1;
                
    }
    /***
     * Detemmina o indice de massa corporaç
     * @param peso peso do utente 
     * @param hight altura do utente
     * @return  IMC
     */
    
    double  iMC(){
        return peso/altura;
        
        
    }

  
    /***
     * Classificao os utente do gginasio
     * se e gordo magro
     * @param iMC
     * @return  classificação
     */
     public String grauObesidade(){
        double imc=iMC();
        if(imc<MAGRO){
            return " MAGRO";
            
        }else if(imc>GORDO){
            return "GORDO";        }
        else{
            return "SAUDAVEL";
        }
       
        
    }
    /***
     * verificar o utente mais uten
     * @param uten utente 
     * @return 
     */
   public   String  yonguest(Utente uten){
         int u=uten.getIdade();
         int u2=getIdade();
         if(u>u2){ 
             return 
                     uten.nome 
                     +" tem "
                     +u2
                     +" + novo que "
                     + nome 
                     +" com "
                     +u;
             
         }else if(u2>u){
             return  
                     uten.nome 
                     +" tem "
                     +u
                     +" E + novo que "
                     + nome 
                     +" com "
                     +u2;
         }else{
             return 
                      uten.nome
                     +" TEM MESMA IDADE "
                      + nome ;

         }
        
    }
   /**
    * vaia mostrar textualmente o nome ,IMC e o grau de obesidade
    * @return 
    */
   public String nomeIMCG(){
       return 
               
               "NOME : "+nome
               +" \n "
               +"IMC : " +String.format("%.2f", iMC())
               + " \n"
               +"Gº OBESIDADE : "+grauObesidade();
   }
   /***
    * metodo para mostrar o nome e grau de obesidade 
    * @return 
    */
   public String nomeGrau(){
         return 
               
               "NOME : "+nome
               +" \n "
               +"Gº OBESIDADE : "+grauObesidade();
       
   }
    @Override
    public String toString() {
        return " NOME :"
                + nome                                  
                +" IDADE : "
                +idade
                +" "
                + genero
                +" PESO "
                + peso
                +" ALTURA  "
                + altura;
    }
}
