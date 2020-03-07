/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import entites.Data;

/**
 *
 * @author arccenio
 */
public class Main {

    public static void main(String[] args) {
        Data data1 = new Data(2020, 03, 03);
        System.out.println("TO a Linha b");
        System.out.println(data1);
        System.out.println(data1.toAnoMesDiaString());
        Data data2 = new Data(1974, 04, 25);
        System.out.println(data2);
        if (data1.isMaior(data2)) {
            System.out.println(data1 + " e maior que  a data " + data2);

        } else {
            System.out.println(data2 + " e maior que  a data " + data1);
        }
        System.out.println(" ");

        System.out.println("Diferenca de numero de dias entre a data1 e a data2");
        System.out.println(data1.calcularDiferenca(data2));
        System.out.println(" ");

        System.out.println("Numero dedias que falta para o natal");
        System.out.println(data1.calcularDiferenca(2020, 12, 15));
        System.out.println(" ");
        System.out.println(data2.determinarDiaDaSemana());
        System.out.println(""+ data2);
        
        System.out.println("O ano é bissexto "+data2.isAnoBissexto(1974));
    }

}
