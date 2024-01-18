package br.com.alura.lab04.OrdenandoDados;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo: " + getNome();
    }

    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        Titulo titulo1 = new Titulo("O que passei para passar!");
        Titulo titulo2 = new Titulo("Estratégia Concurso!");
        Titulo titulo3 = new Titulo("Aprovado Tucuju!");
        Titulo titulo4 = new Titulo("Zerei, mas passe!");

        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);

        Collections.sort(listaTitulos,Collections.reverseOrder());

        //System.out.println(listaTitulos, Collections.reverseOrder());
        for (Titulo titulo: listaTitulos
             ) {
            System.out.println(titulo);
        }
    }
}


