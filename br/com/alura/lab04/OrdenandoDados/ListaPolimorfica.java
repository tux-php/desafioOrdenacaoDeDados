package br.com.alura.lab04.OrdenandoDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaPolimorfica {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        listaPolimorfica= new ArrayList<>();
        listaPolimorfica.add("Fernando");
        listaPolimorfica.add("Dayanne");
        listaPolimorfica.add("Guilherme");
        listaPolimorfica.add("Eep");

        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("ElementoA");
        listaPolimorfica.add("ElementoB");
        listaPolimorfica.add("ElementoC");

        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
