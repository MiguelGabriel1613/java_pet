package br.com.petshop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorAnimais {
    private List<Animal> listaAnimais; // Lista para armazenar os animais
    private Scanner scanner;
    private final String ARQUIVO_CSV = "ANIMAIS_CSV";
    

    public GerenciadorAnimais() {
        this.listaAnimais = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    // Método para cadastrar um animal (Gato ou Cachorro)
    public void cadastrarAnimal(String tipo, Scanner scanner) {
        System.out.print("Digite o nome do " + tipo + ": ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do " + tipo + ": ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (tipo.equals("Gato")) { // Cadastrar Gato
            System.out.print("Cor do Pelo do Gato: ");
            String corPelo = scanner.nextLine();
            Gato gato = new Gato(nome, idade, corPelo);
            listaAnimais.add(gato);
            System.out.println("✅ Gato cadastrado com sucesso!");
        } else if (tipo.equals("Cachorro")) { // Cadastrar Cachorro
            System.out.print("Raça do Cachorro: ");
            String raca = scanner.nextLine();
            Cachorro cachorro = new Cachorro(nome, idade, raca);
            listaAnimais.add(cachorro);
            System.out.println("✅ Cachorro cadastrado com sucesso!");
        } else {
            System.out.println("⚠ Tipo de animal inválido.");
        }
    }

    // Método para exibir todos os animais cadastrados
    public void exibirAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("⚠ Nenhum animal cadastrado!");
        } else {
            System.out.println("\n🐾 LISTA DE ANIMAIS CADASTRADOS 🐾");
            for (Animal animal : listaAnimais) {
                animal.exibirInfo();
                System.out.println("--------------------------");
            }
        }
    }

    // Método para localizar um animal por nome
    public void localizarAnimal(Scanner scanner) {
        System.out.print("Digite o nome do animal que deseja localizar: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;

        System.out.println("\n🔎 RESULTADO DA BUSCA:");
        for (Animal animal : listaAnimais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                animal.exibirInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("⚠ Nenhum animal encontrado com o nome '" + nome + "'.");
        }
    }
}
