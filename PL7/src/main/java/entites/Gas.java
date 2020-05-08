package entites;

public  class Gas  extends  Contador{
    private    final double consumoUnitario=0.8;
    private  int cont;

    public Gas() {

    }

    public Gas(int consumo, int id) {
        super(consumo, id);
        cont++;
    }



    /**
     * esse metodo calula  o custo do consumo de gas
     *
     * @return custo
     */
    public double custoConsumo() {
        return super.getConsumo()*consumoUnitario;
    }
    @Override
    public String toString() {
        return
                " GAS- " + cont+" "+
                 super.toString()
                +" Custo "+custoConsumo();
    }


}
