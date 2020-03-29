/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author arccenio
 */
public class Reformado extends  Contribuintes {
   private static final  double TRT=0.1; 
   private static final double TO=0.3;

    public Reformado() {
    }

    public Reformado(String nome, String morada) {
        super(nome, morada);
    }

    @Override
    double calcularRO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
