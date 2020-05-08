package main;

import entites.Contador;
import entites.Gas;

public class Main {
    public static void main(String[] args) {
        Contador []contardors= new Contador[5];
        Gas l=new Gas(300,11748);
        Gas p=new Gas(300,11748);
        contardors[1]=l;
        contardors[2]=p;
    for(Contador list : contardors){
        System.out.println(list );

    }
        System.out.println(l.toString());

    }
}
