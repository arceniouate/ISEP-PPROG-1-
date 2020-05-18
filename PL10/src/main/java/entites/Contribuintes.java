package entites;

import java.util.Objects;

public abstract class Contribuintes {
    /**
     * nome da pessoa que contribuie
     */
    private String nome;
    /***
     * morada do contribuite
     */
    private String morada;

    /**
     * contrutor sem parametro com a fução de inicializar as variaveis
     */
    public Contribuintes() {
        this.nome="";
        this.morada="";
    }

    /**
     * contrutor com parametrosque vai me permitir contruir um instacia na classe
     * principal porem essa classe não pode ser intaciada por
     * ser uma classe abstrata
     * @param nome nome do contribuite
     * @param morada morado do contribuite
     */
    public Contribuintes(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    /****
     * Acesso do nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * modificador od acesso do nome
     * @param nome nome contribuinte
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /****
     * Acesso do Morada
     * @return Morada
     */
    public String getMorada() {
        return morada;
    }
    /**
     * modificador od acesso do morada
     * @param morada morada  contribuinte
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public abstract  double impostoE();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contribuintes)) return false;
        Contribuintes that = (Contribuintes) o;
        return nome.equals(that.nome) &&
                morada.equals(that.morada);
    }




    @Override
    public String toString() {
        return
                "nome : " + nome + "\n" +
                " morada :'" + morada +"\n";
    }
}
