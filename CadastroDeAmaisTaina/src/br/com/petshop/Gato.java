package br.com.petshop;

// Gato HERDA de Animal
public class Gato extends Animal {
    String corPelo;

    // Construtor que chama o construtor da superclasse Animal
    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);  // Chama o construtor da superclasse Animal
        this.corPelo = corPelo;
    }

    // Método para miar
    public void miar() {
        System.out.println(nome + " está miando: Miau Miau!");
    }

    // Método exibirInfo da classe Animal é utilizado sem sobrescrição
    public void exibirInfoGato() {
        // Acessando diretamente o método da superclasse
        super.exibirInfo();  // Chama o método exibirInfo da superclasse
        System.out.println("Cor do Pelo: " + corPelo);
    }

    // Método para calcular a idade do gato em anos humanos
    public int idadeEmAnosHumanosGato() {
        if (idade == 1) {
            return 15;
        } else if (idade == 2) {
            return 24; // 15 + 9
        } else {
            return 24 + (idade - 2) * 4;
        }
    }
}
