package entites;

public abstract class Trabalhador extends  Contribuintes{
    private double rT;
    private double oR;
    /**
     * contrutor sem parametro com a fução de inicializar as variaveis
     */
    public Trabalhador() {
        this.oR=0.0;
        this.rT=0.0;
    }

    /**
     * contrutor com parametrosque vai me permitir contruir um instacia na classe
     * principal porem essa classe não pode ser intaciada por
     * ser uma classe abstrata
     *
     * @param nome   nome do contribuite
     * @param morada morado do contribuite
     * @param rT  or do contribuinte
     * @param oR or do contribuinte
     */
    public Trabalhador(String nome, String morada, double rT, double oR) {
        super(nome, morada);
        this.rT = rT;
        this.oR = oR;
    }

    /**
     * acessor do rT
     * @return rt
     */
    public double getrT() {
        return rT;
    }

    /**
     * modificador
     * @param rT rt
     */
    public void setrT(double rT) {
        this.rT = rT;
    }
    /**
     * acessor do oR
     * @return oR
     */
    public double getoR() {
        return oR;
    }
    /**
     * modificador  do oR
     * @param oR oE
     */
    public void setoR(double oR) {
        this.oR = oR;
    }

    /**
     * metodo para calcilar o imposto Extaordinario
     * @return imposto Extraordinario
     */
    @Override
    public abstract   double impostoE();

    @Override
    public String toString() {
        return super.toString()+
                "RT : " + rT + "\n"+
                "OR : " + oR ;
    }
}

