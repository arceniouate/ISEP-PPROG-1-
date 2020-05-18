package entites;

public class Reformado extends  Trabalhador{
    private final double  taxOR=0.1;
    private final double  taxOT=0.3;

    /**
     * contrutor sem parametro com a fução de inicializar as variaveis
     */
    public Reformado() {
    }

    /**
     * contrutor com parametrosque vai me permitir contruir um instacia na classe
     * principal porem essa classe não pode ser intaciada por
     * ser uma classe abstrata
     *
     * @param nome   nome do contribuite
     * @param morada morado do contribuite
     * @param rT     or do contribuinte
     * @param oR     or do contribuinte
     */
    public Reformado(String nome, String morada, double rT, double oR) {
        super(nome, morada, rT, oR);
    }

    /**
     * metodo para calcilar o imposto Extaordinario
     *
     * @return imposto Extraordinario
     */
    public double impostoE() {
        return super.getoR()*taxOR+super.getrT()*taxOT;
    }

    @Override
    public String toString() {
        return "Reformado \n"+
                super.toString()
                +"Valor imposto a pagar "
                +impostoE();
    }
}
