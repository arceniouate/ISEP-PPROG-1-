package entites;

public class Desempregado extends  Contribuintes{
    private int mesesPAragem;
    private double oR;
    private final double  taxOR1=0.2;

    /**
     * contrutor sem parametro com a fução de inicializar as variaveis
     */
    public Desempregado() {
        this.mesesPAragem = 0;
        this.oR=0.0;
    }

    /**
     * contrutor com parametrosque vai me permitir contruir um instacia na classe
     * principal porem essa classe não pode ser intaciada por
     * ser uma classe abstrata
     *
     * @param nome   nome do contribuite
     * @param morada morado do contribuite
     */
    public Desempregado(String nome, String morada, int mesesPAragem, double oR) {
        super(nome, morada);
        this.mesesPAragem = mesesPAragem;
        this.oR = oR;
    }

    public double getoR() {
        return oR;
    }

    public void setoR(double oR) {
        this.oR = oR;
    }

    /**
     * acessor  dos meses de paragem
     * @return
     */
    public int getMesesPAragem() {
        return mesesPAragem;
    }

    /***
     * modificador do meses de paragem
     * @param mesesPAragem meses de paragem
     */
    public void setMesesPAragem(int mesesPAragem) {
        this.mesesPAragem = mesesPAragem;
    }

    /**
     * calcular valor deo imposto
     * @return
     */
    public double impostoE() {
         return oR*taxOR1;
    }

    /**
     * metodo vai aprensentar o noe«me e o valor do imposto a pagar
     * @return
     */
    public String tonomeImposto() {
        return "Nome "+
        super.getNome()
                +"  Imposto  Ext a pagar "+
                impostoE();
    }



    @Override
    public String toString() {
        return super.toString()+
                "mesesPAragem=" + mesesPAragem +
                ", oR=" + oR +
                "valor Imposto "+
                impostoE();


    }
}
