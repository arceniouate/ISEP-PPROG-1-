/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myaplication;

import vecimentos.Trabalhador;
import vecimentos.TrabalhadorComissao;
import vecimentos.TrabalhadorHora;
import vecimentos.TrabalhadorPeca;

/**
 *
 * @author arccenio
 */
public class Main {

    public static void main(String[] args) {
        TrabalhadorPeca peca = new TrabalhadorPeca("Jorge Silva", 53, 63);
        TrabalhadorComissao comissao = new TrabalhadorComissao("Sousa Ferreira", (float) 650.00, (float) 4.25, (float) 2731.51);
        TrabalhadorHora hora = new TrabalhadorHora("Carlos Miguel", 168, (float) 4.50);
        Trabalhador[] array = new Trabalhador[10];
        
            array[0] = peca;
            array[1] = hora;
            array[2] = comissao;

        for (Object object : array) {
            if(object == null){
            } else {
                System.out.println(object);
            }
        }
           
       
    }
}
