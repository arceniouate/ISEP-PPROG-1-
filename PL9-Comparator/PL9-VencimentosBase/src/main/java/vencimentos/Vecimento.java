package vencimentos;

import java.util.Comparator;

public class Vecimento  implements Comparator<Trabalhador> {


    @Override
    public int compare(Trabalhador t, Trabalhador t1) {
        return (t.calcularVencimento()<t1.calcularVencimento())? -1 :
                (t.calcularVencimento()>t1.calcularVencimento())? 1:0;

    }
}
