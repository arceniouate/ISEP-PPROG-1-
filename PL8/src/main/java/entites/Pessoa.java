package entites;

public class Pessoa {
    private String name;
    private Integer id;

    /**
     * contrutor sem parametro
     */
    public Pessoa() {
    }

    /**
     * Contrutor com parametro com objetivo de
     * criar instacia  na Classe principal
     * @param name da pessoa
     * @param id da pessoa
     */
    public Pessoa(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    /***
     * Acesso do nome
     * @return nome da pessoa
     */
    public String getName() {
        return name;
    }

    /**
     * modificador do nome
     * @param name nome da pessoa
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
        return
                "Name :"+name+"\n"
                +"ID "+id+"\n";
    }
}
