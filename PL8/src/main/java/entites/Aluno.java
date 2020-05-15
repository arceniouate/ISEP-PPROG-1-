package entites;

public class Aluno  extends Pessoa {
    private Integer nMecan;

    /**
     * contrutor sem parametro
     */
    public Aluno() {
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     *
     * @param name do aluno
     * @param id do aluno
     * @param nMecan numero mecanografico do alunof
     */
    public Aluno(String name, Integer id, Integer nMecan) {
        super(name, id);
        this.nMecan = nMecan;
    }

    /**
     * Acessor  do numero meconagrafico
     * do aluno
     * @return nº Mecanografico
     */
    public Integer getnMecan() {
        return nMecan;
    }

    @Override
    public String toString() {
        return "===========ESCOLA============= \n" +
                " =========ALUNO===========\n"+
                super.toString()+
               "Nº Mecan : "+nMecan+"\n";
    }
}
