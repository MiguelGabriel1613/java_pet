package br.com.petshop;
import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Exibir animais");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                  
                    System.out.print("Nome do Cachorro: ");
                    String nomeCachorro = scanner.nextLine();
                    System.out.print("Idade do Cachorro: ");
                    int idadeCachorro = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Raça do Cachorro: ");
                    String raca = scanner.nextLine();
                    System.out.print("Porte do Cachorro (Pequeno, Médio, Grande): ");
                    String porteCachorro = scanner.nextLine();

                    animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca, porteCachorro));
                    System.out.println("Cachorro cadastrado com sucesso.");
                    break;

                case 2:
                  
                    System.out.print("Nome do Gato: ");
                    String nomeGato = scanner.nextLine();
                    System.out.print("Idade do Gato: ");
                    int idadeGato = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Cor do Pelo do Gato: ");
                    String corPelo = scanner.nextLine();
                    System.out.print("Porte do Gato (Pequeno, Médio, Grande): ");
                    String porteGato = scanner.nextLine();

                    animais.add(new Gato(nomeGato, idadeGato, corPelo, porteGato));
                    System.out.println("Gato cadastrado com sucesso!");
                    break;

                case 3:
                   
                    System.out.println("\nLista de animais cadastrados:");
                    for (Animal animal : animais) {
                        animal.exibirInfo();
                        System.out.println("-----------------------------");
                    }
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
