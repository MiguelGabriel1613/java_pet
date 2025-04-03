package br.com.petshop;
public class Cachorro extends Animal {
    private String raca;
    private String porte; 
    
    public Cachorro(String nomeCachorro, int idadeCachorro, String racaCachorro, String porteCachorro) {
        super(nomeCachorro, idadeCachorro); 
        raca = racaCachorro;
        porte = porteCachorro;
    }

    public void latir() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }

    public void exibirInfo() {
        super.exibirInfo();  
        System.out.println("Raça: " + raca);
        System.out.println("Porte: " + porte); 

    }

  }