import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Meu Malvado Favorito!");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracaoEmMinutos(140);
        System.out.println("Duracao do filme : " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        System.out.println("Média de avaliações do filme: " +meuFilme.getTotalDeAvaliacoes());

        Serie myLittlePony = new Serie();
        myLittlePony.setNome("My Little Pony");
        myLittlePony.setAnoDeLancamento(2000);
        myLittlePony.exibeFichaTecnica();
        myLittlePony.setTemporadas(10);
        myLittlePony.setEpisodiosPorTemporadas(9);
        myLittlePony.setMinutosPorEpisodios(30);
        System.out.println("duracao para maratonar My Little Pony: " + myLittlePony.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("4 vidas de um cao");
        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(160);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(myLittlePony);
        System.out.println(calculadora.getTempoTotal());

    }
}
