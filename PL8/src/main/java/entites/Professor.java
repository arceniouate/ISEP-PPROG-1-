package entites;

public abstract class Professor  extends  Pessoa implements Salario{
     private  double salarioBase;

    /**
     * contrutor sem parametro
     */
    public Professor() {

    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     *
     * @param name da pessoa
     * @param id   da pessoa
     */
    public Professor(String name, Integer id) {
        super(name, id);
        this.salarioBase = 1500;

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "===========ESCOLA============= \n" +
                " =========PROFESSORES===========\n"+
                super.toString()
                ;
    }

    /**
     * calclular o salario do professoe
     * @return retorna o salario
     */
    public abstract double valorMes();
}
