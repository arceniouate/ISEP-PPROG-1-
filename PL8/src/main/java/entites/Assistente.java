package entites;

public class Assistente  extends  Professor{
    /**
     * contrutor sem parametro
     */
    public Assistente() {
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     *
     * @param name da pessoa
     * @param id   da pessoa
     */
    public Assistente(String name, Integer id) {
        super(name, id);
    }

    /**
     * calclular o salario do professoe
     *
     * @return retorna o salario
     */
    public double valorMes() {

        return  super.getSalarioBase();
    }

    @Override
    public String toString() {
        return "ASSISTENTE \n"
                +super.toString()
                +"Salario : "+String.format("%.2f",valorMes());
    }
}
