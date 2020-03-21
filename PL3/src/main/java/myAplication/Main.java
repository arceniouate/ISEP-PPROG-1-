/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myAplication;

import entites.Tempo;
import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        Tempo tp = new Tempo(1, 30, 59);
        Tempo tp1 = new Tempo(00, 30, 30);
        System.out.println(tp);
        System.out.println("Tempo1 e Moior que o Tempo :" + tp.isMAior(tp1));
        System.out.println("");
        System.out.println("Diferenca de TEmpo em segundo ");
        System.out.println(+tp.difernc(tp1));
        System.out.println("");
        System.out.println("Diferenca de Tempo");
        System.out.println(tp.diferencaTemp(tp1));
        

//        System.out.println("how many secand do yo want to add");
//        int s = p.nextInt();
//        int a = l.addSeconf(s);
//        System.out.println(a);
    }

}
