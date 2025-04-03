package br.com.petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarAnimais {  // Nome da classe alterado para GerenciarAnimais
    private List<Animal> listaAnimais;
    private Scanner scanner;

    public GerenciarAnimais() {
        this.listaAnimais = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void cadastrarCachorro() {
        System.out.print("Nome do Cachorro: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Cachorro: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Raça do Cachorro: ");
        String raca = scanner.nextLine();
        System.out.print("Porte do Cachorro (Pequeno, Médio, Grande): ");
        String porte = scanner.nextLine();

        listaAnimais.add(new Cachorro(nome, idade, raca, porte));
        System.out.println("✅ Cachorro cadastrado com sucesso!");
    }

    public void cadastrarGato() {
        System.out.print("Nome do Gato: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Gato: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Cor do Pelo do Gato: ");
        String corPelo = scanner.nextLine();
        System.out.print("Porte do Gato (Pequeno, Médio, Grande): ");
        String porte = scanner.nextLine();

        listaAnimais.add(new Gato(nome, idade, corPelo, porte));
        System.out.println("✅ Gato cadastrado com sucesso!");
    }

    public void exibirAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("⚠ Nenhum animal cadastrado!");
        } else {
            System.out.println("\n🐾 LISTA DE ANIMAIS CADASTRADOS 🐶");
            for (Animal animal : listaAnimais) {
                animal.exibirInfo();
                System.out.println("--------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarAnimais gerenciador = new GerenciarAnimais();  // Aqui é a instância da classe GerenciarAnimais
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Exibir animais cadastrados");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    gerenciador.cadastrarCachorro();
                    break;
                case 2:
                    gerenciador.cadastrarGato();
                    break;
                case 3:
                    gerenciador.exibirAnimais();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}

class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

class Cachorro extends Animal {
    String raca;
    String porteCachorro; // Modificado para evitar conflito

    public Cachorro(String nome, int idade, String raca, String porteCachorro) {
        super(nome, idade);
        this.raca = raca;
        this.porteCachorro = porteCachorro;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
        System.out.println("Porte: " + porteCachorro); // Usando o nome atualizado
    }
}

class Gato extends Animal {
    String corPelo;
    String porteGato; // Modificado para evitar conflito

    public Gato(String nome, int idade, String corPelo, String porteGato) {
        super(nome, idade);
        this.corPelo = corPelo;
        this.porteGato = porteGato;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do Pelo: " + corPelo);
        System.out.println("Porte: " + porteGato); // Usando o nome atualizado
    }
}
