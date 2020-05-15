package entites;

public class Bolseiro  extends  Aluno {
    private double  valorBolsa;

    /**
     * contrutor sem parametro
     */
    public Bolseiro(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     *
     * @param name   do aluno
     * @param id     do aluno
     * @param nMecan numero mecanografico do alunof
     */
    public Bolseiro(String name, Integer id, Integer nMecan) {
        super(name, id, nMecan);
        this.valorBolsa = 1000;
    }

    /**
     * Calcular valor a receber pela bolsa
     * @return valor da bolsa
     */
    public double valorMes() {
        return  valorBolsa;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Valor da Bosa : " + valorBolsa ;
    }
}
