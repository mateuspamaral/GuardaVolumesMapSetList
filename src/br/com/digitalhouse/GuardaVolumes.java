package br.com.digitalhouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    //Instantiating
    Map<Integer, List<Peca>> volumes = new HashMap<>();
    private Integer contador = 0;

    //Constructors
    public GuardaVolumes(Map<Integer, List<Peca>> volumes, Integer contador) {
        this.volumes = volumes;
        this.contador = contador;
    }

    public GuardaVolumes(){

    }

    //Getters & Setters
    public Map<Integer, List<Peca>> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<Integer, List<Peca>> volumes) {
        this.volumes = volumes;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    //Methods
    public Integer guardaPecas(List<Peca> listaDePeca){
        contador++;
        volumes.put(contador,listaDePeca);
        return contador;
    }

    public void mostrarPecas() {
        for ( Integer chave : this.volumes.keySet()){
            System.out.println("Dentro do volume " + chave + " estão as seguintes peças:");
            for ( Peca peca : this.volumes.get(chave)){
                System.out.println("Peça marca: " + peca.getMarca() + " e modelo: " + peca.getModelo());
            }
        }
    }

    public void mostrarPecas(Integer numero){
        System.out.println("Dentro do volume " + numero + " estão as seguintes peças:");
        for ( Peca peca : volumes.get(numero)){
            System.out.println("Peça marca: " + peca.getMarca() + " e modelo: " + peca.getModelo());
        }
    }

    public void devolverPecas(Integer numero){
        for (Peca peca : volumes.get(numero)){
            peca.retirada();
        }
        volumes.remove(numero);

    }
}
