package br.com.alura.screenmatch.teste;

// Subclasse Gato
public class Gato extends Animal {
    String nomeDoGato;
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}
