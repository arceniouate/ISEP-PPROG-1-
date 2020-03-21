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
public class Tempo {
    /***
     * Declaracao da variael por omissao
     */
    private static final int  VALORoMISSAO=0;
    private static final int MAX=60;
    /***
     * minuto do Tempo
     */
    private int  min;
    /**
     * horas do Tempo
     */
    private int horas;
    /***
     * segundos do Tempo
     */
    private int segundos;
/***
 * cotrutor sem parametro com inicializados 
 * a zerro
 */
    public Tempo() {
        this.min = VALORoMISSAO;
        this.horas = VALORoMISSAO;
        this.segundos = VALORoMISSAO;
        
    }
    /***
     * Contrutor  com parametros 
     * @param horas horas do tempo
     * @param min  nimutos do tempo
     * @param segundos segundos do tempo
     */
    public Tempo(int horas, int min, int segundos) {
        this.min = min;
        this.horas = horas;
        this.segundos = segundos;
    }
  /**
   * Acessor dos minutos 
   * @return 
   */
    public int getMin() {
        return min;
    }
    /***
     * Modificador de dos minutos 
     * @param min 
     */

    public void setMin(int min) {
        this.min = min;
    }
    /****
     * Acessor das horas
     * @return 
     */
    public int getHoras() {
        return horas;
    }
    /***
     * Modificador das horas 
     * @param horas 
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    /***
     * acessor  dos segundos
     * @return 
     */
    public int getSegundos() {
        return segundos;
    }
    /***
     * Modificador de segundos
     * @param segundos 
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    /**
     * Adicionar  segundos ao tempo
     * @param s
     * @return 
     */
   public int addSeconf(int s){
       return this.segundos+=s;
       
   }
//   int  validate(){
//       if(this.min<60&& segundos<60){ 
//           return true;
//       }
//   }
//    
   /***
    *Verfica se o tempo  e maior que outro
    * @param temp
    * @return 
    */
public boolean isMAior(Tempo temp){
    int totalTime=somaTempo();
    int  totalTime1=temp.somaTempo();
   return totalTime>totalTime1;
    
}
/***
 * 
 * @return 
 */
public int somaTempo(){
    return horas+min+segundos;
} 
/***
 * Difrenca  de 
 * @param t
 * @return 
 */
public int difernc(Tempo t){
    int t1=getSegundos();
    int t2=t.segundos;
    
return t1-t2;  
}
/**
 * 
 * @param t
 * @return 
 */
public int diferencaTemp(Tempo t){
   int r=t.somaTempo();
   int p=somaTempo();
   return r-p; 
}
     
    @Override
    public String toString (){
        if(horas>12){
        return 
                horas
                +":"
                +min
                +":"
                +segundos
                +"PM";
    }else{
            return 
                horas
                +":"
                +min
                +":"
                +segundos
                +"AM";
        }
        
}
}