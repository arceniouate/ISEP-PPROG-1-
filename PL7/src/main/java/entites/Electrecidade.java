package entites;


public abstract class Electrecidade  extends  Contador{
    private  int cont;

    public Electrecidade() {
    }

    public Electrecidade(int consumo, int id) {
        super(consumo, id);
        this.cont = 0;
    }

    @Override
    public String toString() {
        cont ++;
        return "ELECT %d "+cont+
                super.toString();
    }

    /**
     * esse metodo calula  o custo do consumo de gas
     *
     * @return custo
     */
    public  abstract double custoConsumo();
}
