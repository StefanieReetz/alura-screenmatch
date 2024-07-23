package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExeption extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
    return this.mensagem;
    }
}

