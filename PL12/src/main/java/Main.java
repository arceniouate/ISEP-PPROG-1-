import entites.Exposicao;
import entites.Exposicao;
import entites.Quadro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Quadro>listQ=new ArrayList();
        List<Exposicao>listExp=new ArrayList();
        Quadro a=new Quadro("qudor se arte mudai","jose Augusto", 2013);
        listQ.add(a);
        listQ.add(new Quadro("esprecaode amaor","vernica",2011));
        listQ.add(new Quadro("esprecaode amor","Armado",2011));
        Collections.sort(listQ);
        Exposicao exp=new Exposicao("Exposcao Especia",2015,listQ);

        exp.removeQ(a);
        Collections.sort(listExp);

        listExp.add(exp);
        show(listExp);
    }
    public static void show(List<Exposicao>list){
        for(Exposicao lis:list){
            System.out.println(lis);

        }

    }

}
