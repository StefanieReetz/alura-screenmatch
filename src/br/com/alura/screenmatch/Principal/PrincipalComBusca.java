package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoExeption;
import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca:");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=805ffbc9";
            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                //   gson.fromJson(json, Titulo.class);
                TituloOmdb meutituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meutituloOmdb);

                Titulo meuTitulo = new Titulo(meutituloOmdb);
                System.out.println("Meu titlo");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException exception) {
                System.out.println("Aconteceu um erro:\n" + exception.getMessage());
            } catch (IllegalArgumentException argumentException) {
                System.out.println("Ocorreu algum erro, verifique o endereco");
            } catch (ErroDeConversaoDeAnoExeption e) {
                System.out.println(e.getMensagem());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("o programa finalizou corretamente");


    }

}

