package br.com.alura.screenmatch.teste;

// Subclasse Cachorro
public class Cachorro extends Animal {
    String racaDoCachorro;
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}