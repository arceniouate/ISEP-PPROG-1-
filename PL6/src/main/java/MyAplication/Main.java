package MyAplication;

import entites.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contribuintes []list=new Contribuintes[7];
        Reformado r=new Reformado("Joao","Avintes",50,30);
        Desenpregado d=new Desenpregado("Alffredo","Espinhos",3,30);
        TrabalhadorContaPropria tp=new TrabalhadorContaPropria("Osvaldo","Matola",30,55,"Camera Man");
        TrabalhadorContaOtrem to=new TrabalhadorContaOtrem("antonia","Luanda",30,45,"uate.LTD");

                list[0]=r;
                list[1]=d;
                list[2]=tp;
                list[3]=to;




        for ( Contribuintes lista:list) {
            if(lista!=null) {
                System.out.println(lista);
            }
        }
        System.out.println();
        System.out.println(d.tonomeImposto());
        System.out.println();
        d.setoR(55);
        System.out.println(d.tonomeImposto());
    }
}
