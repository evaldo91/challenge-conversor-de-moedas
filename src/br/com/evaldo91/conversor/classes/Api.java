package br.com.evaldo91.conversor.classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {


    public static double inciaApi(String baseCode, String tagetCode, Double valorEntrada) throws IOException, InterruptedException {
      String apiKey = "e802ce989a3bfb9d679b6d08"; // Entre com api aqui;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey +"/pair/"+baseCode+"/"+tagetCode+"/"+valorEntrada))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ApiRec apiRec = gson.fromJson(response.body(), ApiRec.class);
        return Double.parseDouble(apiRec.conversion_result());


    }


}


