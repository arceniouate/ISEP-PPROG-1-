package entites;

import java.util.List;


/**
 * Essa e a classe que representa a exposiçaão dos quadros
 */
public class Exposicao  implements  Comparable<Exposicao>{
    /**
     * representavao do quadro atrvez da designação
     */
    private String desinacao;
    /**
     * ano de realização exposicao
     */
    private Integer anoD;



    /**
     * Lista de quadros
     */
    private List<Quadro> quadroList;

    public Exposicao() {
    }
    public Exposicao(String desinacao, Integer anoD, List<Quadro> quadroList) {
        this.desinacao = desinacao;
        this.anoD = anoD;
        this.quadroList = quadroList;
    }

    public String getDesinacao() {
        return desinacao;
    }

    public List<Quadro> getQuadroList() {
        return quadroList;
    }

    public void setQuadroList(List<Quadro> quadroList) {
        this.quadroList = quadroList;
    }

    public void setDesinacao(String desinacao) {
        this.desinacao = desinacao;
    }

    public Integer getAnoD() {
        return anoD;
    }

    public void setAnoD(Integer anoD) {
        this.anoD = anoD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exposicao exposicão = (Exposicao) o;
        return desinacao.equals(exposicão.desinacao) &&
                anoD.equals(exposicão.anoD) &&
                quadroList.equals(exposicão.quadroList);
    }


    /**
     * metodo vai add um quandro na
     * @param quadro quador adcionadp
     * @return true ou false
     */
    public boolean addQuadro(Quadro quadro){
        return(quadroList.add(quadro))?true:false;
    }


    public boolean  removeQ(Quadro quadro) {
     return  (quadroList.remove(quadro))?true :false;

    }

    @Override
    public String toString() {
        return "EXPOSIÇÃO \n" +
                "desinacao : " + desinacao  +
                " ano da Exposicao " + anoD +
                " \n Lista  dos Quadros \n"
                +quadroList;
    }


    public int compareTo(Exposicao exposicao) {
        return (anoD < exposicao.anoD) ? -1 :
                (anoD > exposicao.anoD) ? 1 : 0;
    }
}

