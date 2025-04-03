package br.com.petshop;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorAnimais gerenciador = new GerenciadorAnimais();
        int opcao;

        // Loop do menu
        do {
            System.out.println("\n==============================");
            System.out.println("= MENU DE CADASTRO DE PETSHOP =");
            System.out.println("==============================");
            System.out.println("1️⃣ Cadastrar GATO");
            System.out.println("2️⃣ Cadastrar CACHORRO");
            System.out.println("3️⃣ Exibir Todos os ANIMAIS");
            System.out.println("4️⃣ Localizar ANIMAL POR NOME");
            System.out.println("0️⃣ Sair");
            System.out.print("➡ Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    gerenciador.cadastrarAnimal("Gato", scanner); // Cadastrar Gato
                    break;
                case 2:
                    gerenciador.cadastrarAnimal("Cachorro", scanner); // Cadastrar Cachorro
                    break;
                case 3:
                    gerenciador.exibirAnimais(); // Exibir Todos os Animais
                    break;
                case 4:
                    gerenciador.localizarAnimal(scanner); // Localizar Animal por Nome
                    break;
                case 0:
                    System.out.println("🔴 Saindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("⚠ Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close(); // Fecha o scanner ao final
    }
}
