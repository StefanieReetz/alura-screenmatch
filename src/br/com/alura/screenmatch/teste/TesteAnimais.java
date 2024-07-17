package br.com.alura.screenmatch.teste;

// Classe de Teste
public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Animal animal = (Animal) cachorro;

        System.out.println(animal.nome);
    }
}
