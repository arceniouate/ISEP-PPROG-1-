/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import entites.Utente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arccenio
 */
public class Main {
    public static void main(String[] args) {
       Utente utente=new Utente("Arcenio","M",34,1.81,20);
        Utente utente2=new Utente("Mafalda","F",23,1.97,95);
        List<Utente> i=new ArrayList();
       i.add(utente );
        i.add(utente2);
        for (Utente utente1 : i) {
            System.out.println(utente1.nomeIMCG());
            
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Utente utente1 : i) {
            if(!utente1.grauObesidade().equals("SAUDAVEL"))
                System.out.println(utente1.nomeGrau());
            
        }
        System.out.println("=========================");

        for (Utente utente1 : i) {
                utente.setAltura(1.45);
                utente.setPeso(35);
                utente.setIdade(45);
            System.out.println(utente1.nomeIMCG());
            
        }
       
        for (Utente utente1 : i) {
                               System.out.println(utente1.yonguest(utente));

               }
            
        }
        
        
        
        
    }
    

