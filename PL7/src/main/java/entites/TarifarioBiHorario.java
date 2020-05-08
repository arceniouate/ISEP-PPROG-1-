package entites;

public class TarifarioBiHorario  extends  Electrecidade{
    private final  double horasVasias=0.066;
    private final  double horasForaVasio=0.066;
    private String horas;

    public TarifarioBiHorario(String horas) {
        this.horas = horas;
    }

    /**
     * contrutor  para criação daa instanca na classe principal
     * @param consumo
     * @param id
     * @param horas
     */
    public TarifarioBiHorario(int consumo, int id, String horas) {
        super(consumo, id);
        this.horas = horas;
    }

    /**
     * esse metodo calula  o custo do consumo de gas
     *
     * @return custo
     */
    public double custoConsumo() {
        if(horas.equals("horas de vasio")){
            return super.getConsumo()*horasVasias;
        }else{
            return super.getConsumo()*horasForaVasio;

        }
    }
}
