package br.com.digitalhouse;

public class Movel extends Peca {
    //Attributes
    private String nome;
    private String tamanho;

    //Constructors
    public Movel(String marca, String modelo, String nome, String tamanho) {
        super(marca, modelo);
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public Movel(String nome, String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public Movel() {

    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //Methods
    @Override
    public void retirada() {
        System.out.println(this.nome + " retirado(a).");
    }
}
