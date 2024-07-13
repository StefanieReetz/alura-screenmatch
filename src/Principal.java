import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Meu Malvado Favorito!");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        System.out.println("\nMédia de avaliações do filme: " +meuFilme.getTotalDeAvaliacoes());
    }
}
