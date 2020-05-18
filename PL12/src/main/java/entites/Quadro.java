package entites;


import java.util.Comparator;

public class Quadro implements Comparable<Quadro> {
    private String designaca;
    private String nomeAutor;
    private Integer anoCriacao;

    public Quadro() {
    }

    public Quadro(String designaca, String nomeAutor, Integer anoCriacao) {
        this.designaca = designaca;
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
    }

    public String getDesignaca() {
        return designaca;
    }

    public void setDesignaca(String designaca) {
        this.designaca = designaca;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    /**
     * implementacao da interface comprable
     * com objetivo de ordenar os quadros
     * segundo os nome
     * @param quadro quadro
     * @return comparacao
     */
    public int compareTo(Quadro quadro) {
        return nomeAutor.compareTo(quadro.nomeAutor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadro quadro = (Quadro) o;
        return nomeAutor.equals(quadro.nomeAutor) &&
                anoCriacao.equals(quadro.anoCriacao);
    }

    public String toString(){
        return  "Designação : "+designaca+"\n"
                +"Nome do Autor : "+nomeAutor+"\n"
                +"Ano de Criacao : "+anoCriacao +"\n";
    }


}
