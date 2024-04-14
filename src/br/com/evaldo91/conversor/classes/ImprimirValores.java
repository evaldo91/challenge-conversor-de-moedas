package br.com.evaldo91.conversor.classes;

import java.io.IOException;

public class ImprimirValores {

    public static void imprimir(double valorEntrada, String baseCode, String tagetCode ) throws IOException, InterruptedException {
        System.out.println("O valor de "
                + Localizacao.localizando(baseCode, valorEntrada).getValorFormatado()
                +" (" + Localizacao.localizando(baseCode, 0).getNomeMoeda() + ") convertido é "
                + Localizacao.localizando(tagetCode,
                Api.inciaApi(baseCode,
                        tagetCode,
                        valorEntrada)).
                getValorFormatado()
                +" (" + Localizacao.localizando(tagetCode, 0).getNomeMoeda() +")");
    }
}
