package br.com.evaldo91.conversor.classes;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Conversor {

    public static void realizarConversao(Scanner entrada, Menu menu) throws IOException, InterruptedException {
        String baseCode = "";
        String tagetCode = "";
        double valorEntrada = 0;
        int opcao = -1;
        String nomeMoedaOrigem ="";
        String nomeMoedaDestino ="";



        menu.mostraMenu();
        do{
            // Seleção da moeda de origem

            baseCode = CodigoPais.codigo("Selecione a moeda de origem (ou 0 para sair):", entrada);
            nomeMoedaOrigem = Localizacao.localizando(baseCode, 0).getNomeMoeda();
            // Seleção da moeda de destino

            tagetCode = CodigoPais.codigo("Selecione a moeda de destino (ou 0 para sair):", entrada);
            nomeMoedaDestino =Localizacao.localizando(tagetCode, 0).getNomeMoeda();
            if (baseCode.equals(tagetCode)){
                System.out.println("Voce selecionou a mesma moeda de origem e moeda de destimo");
            }
        }while (baseCode.equals(tagetCode));





        // Obtenção do valor a ser convertido
        valorEntrada = ObeterValor.valor("converter de " + nomeMoedaOrigem + " para " + nomeMoedaDestino + " (ou 0 para sair):", entrada);


        double valorParaConvercao = Api.inciaApi(baseCode, tagetCode, valorEntrada);
        String valorDeOrigemFormatado = Localizacao.localizando(baseCode, valorEntrada).getValorFormatado();
        String valorConvertidoFormatado = Localizacao.localizando(tagetCode, valorParaConvercao).getValorFormatado();
        System.out.println("O valor de " + valorDeOrigemFormatado +" (" + nomeMoedaOrigem + ") convertido é " + valorConvertidoFormatado +" (" + nomeMoedaDestino +")");
        System.out.println("Deseja encerra o programa?");
    }


}