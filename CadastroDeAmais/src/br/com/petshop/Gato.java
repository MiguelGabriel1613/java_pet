package br.com.petshop;

public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade); // Chama o construtor da classe pai (Animal)
        this.corPelo = corPelo;
        gerarId("Gato"); // Gerar ID para Gato
    }

    public void miar() {
        System.out.println(getNome() + " está miando: Miau Miau!");
    }

    @Override
    public void exibirInfo() {
        // Exibe as informações no formato desejado
        System.out.println(getId() + ", Cor do Pelo: " + corPelo + ", Nome: " + getNome() + ", Idade: " + getIdade() + " anos");
    }
}
