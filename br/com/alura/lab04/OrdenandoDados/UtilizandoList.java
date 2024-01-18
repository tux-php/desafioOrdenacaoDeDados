package br.com.alura.lab04.OrdenandoDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UtilizandoList {
    public static void main(String[] args) {
        //List<String> lista = new ArrayList<>();
        List<String> lista = new LinkedList<>();
        lista.add("Fernando");
        lista.add("Dayanne");
        lista.add("Guilherme");
        lista.add("Eep");

        Collections.sort(lista);

        for (String nome: lista
             ) {
            System.out.println(nome);
        }
    }
}
