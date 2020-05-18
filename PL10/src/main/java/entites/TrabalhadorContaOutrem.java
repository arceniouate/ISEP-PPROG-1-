package entites;

public class TrabalhadorContaOutrem extends  Trabalhador {
    /**
     * nome da impresa  trabalhador
     */

    private String empresa;
    private final double  taxOR=0.1;
    private final double  taxOT=0.2;

    /**
     * contrutor sem parametro com a fução de inicializar as variaveis
     */
    public TrabalhadorContaOutrem() {
        this.empresa ="";
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
    public TrabalhadorContaOutrem(String nome, String morada, double rT, double oR, String empresa) {
        super(nome, morada, rT, oR);
        this.empresa = empresa;
    }

    /**
     * Acessor da profissão
     * @return profissão
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * modificador  da profissão
     * @param empresa profissão
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * metodo para calcilar o imposto Extaordinario
     *
     * @return imposto Extraordinario
     */
    public double impostoE() {
        if(super.getrT()<=30){
            return super.getrT()*taxOT+getoR()*taxOR;
        }else{
            return super.getrT()*taxOR+getoR()*taxOR;

        }
    }

    @Override
    public String toString() {
        return  " Trabalhador conta ontem \n"+
                 super.toString()+
                " Empresa : "+empresa  +"\n"+
                 " valor do Imposto a pagar "+impostoE();

    }
}
