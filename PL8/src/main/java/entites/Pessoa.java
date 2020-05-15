package entites;

public class Escola {
    private String name;
    private Integer id;

    /**
     * contrutor sem parametro
     */
    public Escola() {
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     * @param name
     * @param id
     */
    public Escola(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    /***
     * Acesso do nome
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * modificador do nome
     * @param name nome
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * Acessor do id
     * @return ID
     */
    public Integer getId() {
        return id;
    }



    @Override
    public String toString() {
        return "===========ESCOLA============= " +
                "Name :"+name
                +" ID "+id;
    }
}
