/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myaplication;

import entites.Pessoa;
import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Name ");
        String name=ler.next();
        System.out.println("Age");
        int age=ler.nextInt();
        Pessoa p=new Pessoa(name,age);
        System.out.println(p);
    }
    
}
