package jogodecartas;

import java.util.*;

/**
 * Representa uma mão de jogo.
 *
 * @author ISEP-DEI-PPROG
 */
public class MaoDeJogo {

     /**
     * A mão de jogo.
     */
    private List<Carta> maoDeJogo;
    
    /**
     * Constrói uma instância de {@code MaoDeJogo} recebendo um conjunto de
     * cartas.
     * 
     * @param mao o conjunto de cartas.
     */
    public MaoDeJogo(List<Carta> mao) {
        maoDeJogo = new ArrayList(mao);
    }

    /**
     * Constrói uma instância de {@code MaoDeJogo} vazia, ou seja, sem cartas.
     */
    public MaoDeJogo() {
        maoDeJogo = new ArrayList<>();
    }
    
    /**
     * Constrói uma instância de {@code MaoDeJogo} com as mesmas caraterísticas
     * da mão de jogo recebida por parâmetro.
     * 
     * @param outraMaoDeJogo a mão de jogo com as caraterísticas a copiar.
     */
    public MaoDeJogo(MaoDeJogo outraMaoDeJogo) {
        maoDeJogo = new ArrayList<>();
        for(Carta c : outraMaoDeJogo.maoDeJogo) {
            maoDeJogo.add(new Carta(c));
        }
    }

    /**
     * Devolve a mão de jogo.
     *
     * @return mão de jogo.
     */
    public List<Carta> getMaoDeJogo() {
        return new ArrayList<Carta>(maoDeJogo);
    }
    
    /**
     * Devolve a descrição textual da mão de jogo (uma carta por linha).
     * 
     * @return caraterísticas das cartas da mão de jogo.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Carta c : maoDeJogo) {
            s.append(c.toString());
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Devolve um conjunto com os vários tipos de carta (duque, terno, etc.)
     * existentes na mão de jogo.
     * 
     * @return {@code List} com os tipos de carta existentes na mão de jogo.
     */
    public List<Carta.Tipo> tiposDeCarta() {
        Set<Carta.Tipo>tipoCarta=new HashSet<>();
  for(Carta cat:maoDeJogo){
      tipoCarta.add(cat.getTipo());

  }
return  new ArrayList<>();
    }

    /**
     * Determina quantas cartas de um dado tipo existem na mão de jogo.
     * 
     * @param tipo o tipo de carta.
     * @return quantidade de cartas do tipo, que existem na mão de jogo.
     */
    public int contarCartasDoTipo(Carta.Tipo tipo) {
        int cont=0;
        for(Carta typ:maoDeJogo){
            //não se pode contar a cart duas vezes
            if(typ.equals(tipo)) {
                cont++;
            }
        }
        return cont;
    }

    /***
     *  compara a mao de jogo com o objeto recebido
     *
     * @param o objeto recebido compado co a mao de jogo
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaoDeJogo maoDeJogo1 = (MaoDeJogo) o;
        return maoDeJogo.equals(maoDeJogo1.maoDeJogo);
    }



    /**
     * Ordena a mão de jogo por naipe e, dentro do mesmo naipe, ordena por tipo.
     */
    public void ordenar() {
        // A classe Carta deve implementar a interface Comparable, devendo
        // implementar especificamente Comparable<Carta>
        Collections.sort(maoDeJogo);


    }

}
