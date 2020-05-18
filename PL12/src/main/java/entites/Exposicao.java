package entites;

import java.util.List;


/**
 * Essa e a classe que representa a exposiçaão dos quadros
 */
public class Exposicão  implements  Comparable<Exposicão>{

    /**
     * representavao do quadro atrvez da designação
     */
    private String desinacao;
    /**
     * ano de realização exposicao
     */
    private Integer anoD;

    public Exposicão(String desinacao, Integer anoD, List<Quadro> quadroList) {
        this.desinacao = desinacao;
        this.anoD = anoD;
        this.quadroList = quadroList;
    }

    /**
     * Lista de quadros
     */
    private List<Quadro> quadroList;

    public Exposicão() {
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
        Exposicão exposicão = (Exposicão) o;
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
        if(quadroList.add(quadro)){
            return  true;
        }else{
            return false ;
        }
    }


    public boolean removeQ(Quadro quadro){
        if(quadroList.remove(quadro)){
            return true;
        }else{
            return false ;
        }
    }

    @Override
    public String toString() {
        return "EXPOSIÇÃO \n" +
                "desinacao : " + desinacao  +
                " ano da Exposicao " + anoD +
                " \n Lista  dos Quadros \n"
                +quadroList;
    }


    public int compareTo(Exposicão exposicão){
        if(anoD<exposicão.anoD){
            return -1; }else if(anoD>exposicão.anoD){ return 1;
        } else{return 0; }
    }

}
