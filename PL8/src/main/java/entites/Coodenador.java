package entites;

public class Coodenador extends Professor {
    private final double  majoraca=0.5;

    /**
     * contrutor sem parametro
     */
    public Coodenador() {
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     *
     * @param name da pessoa
     * @param id   da pessoa
     */
    public Coodenador(String name, Integer id) {
        super(name, id);
    }

    /**
     * calclular o salario do professoe
     *
     * @return retorna o salario
     */
    public double valorMes() {
        return super.getSalarioBase()*majoraca;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "Salario : "+String.format("%.2f",valorMes());

    }
}
