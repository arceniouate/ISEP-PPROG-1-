package entites;

public class Adjunto extends Professor  {
    private  final double majoracao=0.2;

    /**
     * contrutor sem parametro
     */
    public Adjunto() {
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     *
     * @param name da pessoa
     * @param id   da pessoa
     */
    public Adjunto(String name, Integer id) {
        super(name, id);
    }
    /**
     * calclular o salario do professoe
     *
     * @return retorna o salario
     */
    public double valorMes() {
        return super.getSalarioBase()*majoracao;
    }


    @Override
    public String toString() {
        return "ADJUNTO \n"+
                super.toString()+
                "Salario "+String.format("%.2f",valorMes());
    }


}
