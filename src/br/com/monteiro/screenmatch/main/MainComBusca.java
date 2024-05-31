package br.com.monteiro.screenmatch.main;

import br.com.monteiro.screenmatch.models.Title;
import br.com.monteiro.screenmatch.models.TituloOmdb;
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

public class MainComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        String busca = " ";
        List<Title> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")){

            System.out.println("Digite o filme que deseja buscar: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=9b4ee23";
            //busca pelo filme no site do OMDB

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());

                String json = response.body();
                System.out.println(json);

                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                Title meuTitulo = new Title(meuTituloOmdb);

                FileWriter escrita = new FileWriter("filmes.txt");
                escrita.write(meuTitulo.toString());
                escrita.close();
            } catch (Exception e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Fim do programa !");
            }
        }


    }
}
