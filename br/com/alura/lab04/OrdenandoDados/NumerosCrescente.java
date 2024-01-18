package br.com.alura.lab04.OrdenandoDados;

import java.util.ArrayList;
import java.util.Collections;

public class NumerosCrescente {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        Collections.sort(lista);
        for (Integer num: lista
             ) {
            System.out.println(num);
        }
    }
}
