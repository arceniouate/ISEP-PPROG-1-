package entites;

public class TrabalhadorContaPropria extends Trabalhador {
    private String profissao;
    private final double  taxOR=0.2;
    private final double  taxOR1=0.5;
    private final double  taxOT=0.5;

    /**
     * contrutor sem parametro com a fução de inicializar as variaveis
     */
    public TrabalhadorContaPropria() {
        this.profissao = "";
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
    public TrabalhadorContaPropria(String nome, String morada, double rT, double oR, String profissao) {
        super(nome, morada, rT, oR);
        this.profissao = profissao;
    }

    /**
     * acesso da profissão
     * @return profissão
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Modificador da profissão
     * @param profissao profissão
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * metodo para calcilar o imposto Extaordinario
     *
     * @return imposto Extraordinario
     */
    public double impostoE() {
        if(super.getoR()<=30){
            return super.getrT()*taxOR+getoR()*taxOR;
        }else{
            return super.getrT()*taxOR+getoR()*taxOR1;

        }
    }

    @Override
    public String toString() {
        return "Trbalhador conta propria \n "+
                "profissao= " + profissao + "\n"+
                super.toString()
              +"valor imposto a pagar  : "+impostoE();
    }
}
