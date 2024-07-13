package br.com.alura.screenmatch.modelos;

// Isso é um objeto
public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int DuracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("\nNome do filme: " + nome);
        System.out.println("Ano de Lançamento:  " + anoDeLancamento);

    }

    public void setNome(String nome){
        this.nome = nome;
    }



    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double mediaDasAvaliacoes(){
        //Metodo ou a maneira de
        return somaDasAvaliacoes / totalDeAvaliacoes;
    };
}


