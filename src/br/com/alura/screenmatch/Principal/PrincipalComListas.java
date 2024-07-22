package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Meu Malvado Favorito!",2010);
        meuFilme.avalia(8);

        Serie myLittlePony = new Serie("My Little Pony",2000 );
        myLittlePony.avalia(10);

        Filme outroFilme = new Filme("4 vidas de um cao",2000);
        outroFilme.avalia(7);

        var filmeDaMae = new Filme("Menino do Pijama Listrado",2008);
        filmeDaMae.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaMae);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(myLittlePony);

        for(Titulo item:lista){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Avaliacao em estrelas: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Wallace");
        buscaPorArtista.add("Wagner");

        buscaPorArtista.add("Jennifer");
        buscaPorArtista.add("Anne Frank");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("depois de uma ordenacao");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(lista);
    }
}
