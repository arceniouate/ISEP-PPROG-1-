package myAplication;

import entites.*;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> list=new ArrayList();
        Aluno aluno=new Aluno("Valdimiro",1193,1888);
        Bolseiro b=new Bolseiro("Daniel",1158,333);
        Assistente a =new Assistente("MAfalda",113);
        Adjunto ad=new Adjunto("Marcio",12333);
        Coodenador c=new Coodenador("Vanildo ",75757);
        list.add(aluno);
        list.add(b);
        list.add(a);
        list.add(ad);
        list.add(c);
         for(Pessoa p:list){
             System.out.println(p);

         }
    }
}
