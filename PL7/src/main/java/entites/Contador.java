package entites;

public abstract class Contador {
    private int consumo;
    private int id;

    public Contador() {
    }

    public Contador(int consumo, int id) {
        this.consumo = consumo;
        this.id = id;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getId() {
        return id;
    }

    /**
     * esse metodo calula  o custo do consumo de gas
     * @return custo
     */
    public abstract double custoConsumo();
    @Override
    public String toString(){
        return "ID : "+id+
                " Cousumo : "+consumo;
    }


}
