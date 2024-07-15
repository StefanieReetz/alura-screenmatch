package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;


    public int getTotalVizzualicacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVizzualicacoes(int totalVizzualicacoes) {
        this.totalVisualizacoes = totalVizzualicacoes;
    }

    public int getNumero() {
        if (totalVisualizacoes > 100) {
            return 4;
        }else {
            return 2;
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
