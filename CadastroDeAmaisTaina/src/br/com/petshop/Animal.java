package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String nome;
    private int idade;
    private String porte;

    public Animal(String nome, int idade, String porte) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPorte() {
        return porte;
    }
    
    public int idadeEmAnosHumanos() {
        if (idade == 1) return 15;
        if (idade == 2) return 24;
        return 24 + (idade - 2) * 4;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos, Porte: " + porte);
        System.out.println("Idade em anos humanos: " + idadeEmAnosHumanos());
    }
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca, String porte) {
        super(nome, idade, porte);
        this.raca = raca;
    }

    public void latir() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }
    
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
    }
}

class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo, String porte) {
        super(nome, idade, porte);
        this.corPelo = corPelo;
    }

    public void miar() {
        System.out.println(getNome() + " está miando: Miau Miau!");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do Pelo: " + corPelo);
    }
}
