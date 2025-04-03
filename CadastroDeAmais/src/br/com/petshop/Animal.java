package br.com.petshop;

public class Animal {
    private String nome;
    private int idade;
    private String id;
    private static int idCounterGato = 1;  
    private static int idCounterCachorro = 1;  

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    // Gerar ID com base no tipo de animal (Gato ou Cachorro)
    protected void gerarId(String tipo) {
        if (tipo.equals("Gato")) {
            this.id = "G" + idCounterGato++;
        } else if (tipo.equals("Cachorro")) {
            this.id = "C" + idCounterCachorro++;
        }
    }

    // Método para exibir as informações sobre o animal
    public void exibirInfo() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Idade: " + idade + " anos ");
    }
}
