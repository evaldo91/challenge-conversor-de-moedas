package br.com.evaldo91.conversor.classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    private String baseCode;
    private String tagetCode;
    private Double valorEntrada;
    private Double valorSaida;
    private String apiKey = "e802ce989a3bfb9d679b6d08"; // Entre com api aqui;





    public Api(String baseCode, String tagetCode, Double valorEntrada) {
        this.baseCode = baseCode;
        this.tagetCode = tagetCode;
        this.valorEntrada = valorEntrada;

    }

    public double inciaApi() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey +"/pair/"+baseCode+"/"+tagetCode+"/"+valorEntrada))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ApiRec apiRec = gson.fromJson(response.body(), ApiRec.class);
        return this.valorSaida= Double.valueOf(apiRec.conversion_result());





// linha para teste
 //       String json = response.body();
  //      System.out.println(json);




    }


}


