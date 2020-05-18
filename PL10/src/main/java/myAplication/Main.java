package entites;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contribuintes> list=new ArrayList<Contribuintes>();
        list.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        list.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        list.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        list.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        list.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        list.add(new TrabalhadorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        list.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        list.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        list.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        list.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        list.add(new Desempregado("Maria Sá", "Afife", 230, 8));
        list.remove(0);
        for(Contribuintes c:list){
            System.out.println(c);
        }

    }
}
