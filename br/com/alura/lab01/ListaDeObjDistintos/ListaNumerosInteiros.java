package br.com.alura.lab01.ListaDeObjDistintos;

import java.util.ArrayList;
import java.util.Collections;

public class ListaNumerosInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<>();
        Integer num1 = 5;
        Integer num2 = 9;
        Integer num3 = 3;
        Integer num4 = 15;

        listaNum.add(num1);
        listaNum.add(num2);
        listaNum.add(num3);
        listaNum.add(num4);

        Collections.sort(listaNum);
        for (Integer numero: listaNum
             ) {
            System.out.println(numero);
        }

    }
}
