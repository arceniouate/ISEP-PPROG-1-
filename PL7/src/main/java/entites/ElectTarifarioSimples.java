package entites;

public class ElectTarifarioSimples  extends  Electrecidade{
    private  final double potenciaContratada=6.9;
    private final double kwh=0.13;
    private final double kwh1=0.16;
    private double kva;

    public ElectTarifarioSimples(double kva) {
        this.kva = kva;
    }

    /***
     *contrutor com paramtros para criação da intancia
     * @param consumo
     * @param id
     * @param kva
     */
    public ElectTarifarioSimples(int consumo, int id, double kva) {
        super(consumo, id);
        this.kva = kva;
    }

    public double getKva() {
        return kva;
    }

    public void setKva(double kva) {
        this.kva = kva;
    }
    /**
     * esse metodo calula  o custo do consumo de gas
     *
     * @return custo
     */
    public double custoConsumo() {
        if(kva<potenciaContratada){
            return  super.getConsumo()*kwh;
        }else{
            return super.getConsumo()*kwh1;
        }
    }
}
