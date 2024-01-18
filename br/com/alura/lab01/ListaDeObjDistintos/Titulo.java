package br.com.alura.lab01.ListaDeObjDistintos;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    public static void main(String[] args) {
        ArrayList<Titulo> listaNomes = new ArrayList<>();
        Titulo titulo1 = new Titulo("O senhor dos anéis");
        Titulo titulo2 = new Titulo("Código Limpo");
        Titulo titulo3 = new Titulo("Engenharia de Software");
        Titulo titulo4 = new Titulo("Ciência de Dados");
        Titulo titulo5 = new Titulo("Algoritmo Estruturado");

        listaNomes.add(titulo1);
        listaNomes.add(titulo2);
        listaNomes.add(titulo3);
        listaNomes.add(titulo4);
        listaNomes.add(titulo5);

        Collections.sort(listaNomes);
        //Collections.sort(listaNomes, Collections.reverseOrder());


        for (Titulo titulo: listaNomes
             ) {
            System.out.println(titulo.getNome());
        }
    }
}


