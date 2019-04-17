package br.com.digitalhouse;

public abstract class Peca {
    //Attributes
    private String marca;
    private String modelo;

    //Constructors
    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Peca(){

    }

    //Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Methods
    public abstract void retirada();
}
