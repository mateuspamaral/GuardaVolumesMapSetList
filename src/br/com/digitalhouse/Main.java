package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instantiating
        Peca geladeira = new Eletrodomestico("Samsung", "430l", "Geladeira", "Média");
        Peca camaSolteiro = new Movel("Orthobom", "Solteiro", "Cama Solteiro", "Pequena");

        List<Peca> pecas = new ArrayList<>();

        pecas.add(geladeira);
        pecas.add(camaSolteiro);

        GuardaVolumes guardaVolumes = new GuardaVolumes();

        System.out.println("Seu guarda volumes é o: " + guardaVolumes.guardaPecas(pecas));

        guardaVolumes.mostrarPecas();

        Scanner reader = new Scanner(System.in);
        System.out.print("Digite o número do seu looker: ");
        int option = reader.nextInt();
        guardaVolumes.mostrarPecas(option);

        guardaVolumes.devolverPecas(1);
    }
}