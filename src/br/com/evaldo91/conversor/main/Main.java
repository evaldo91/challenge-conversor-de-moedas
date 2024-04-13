package br.com.evaldo91.conversor.main;

import br.com.evaldo91.conversor.classes.Api;
import br.com.evaldo91.conversor.classes.Localizacao;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        String baseCode = "";
        String tagetCode = "";
        double valorEntrada = 0;

        System.out.println("Bem vindo selecione uma das opções ou 0 para sair:");


        int opcao;
        do {
            System.out.println("Conveter de");
            System.out.println("""
                    1 - Real Brasileiro (9BRL)
                    2 - Dólar Americano (USD)
                    3 - Euro (EUR)
                    4 - Libra esterlina (GBP)
                    5 - Iene (JPY)
                    6 - Dólar Australiano (AUD)
                    7 - Franco Suíço (CHF)
                    8 - Dólar Canadense (CAD)
                    9 - Renminbi (Yuan) (CNY)
                    10 - Peso Argentino (ARS)
                    11 - Lira Turca (TRY)
                    12 - Boliviano boliviano (BOB)
                    13 - Peso chileno (CLP)
                    14 - Peso colombiano (COP)
                    """);

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    baseCode = "BRL";
                    break;
                case 2:
                    baseCode = "USD";
                    break;
                case 3:
                    baseCode = "EUR";
                    break;
                case 4:
                    baseCode = "GBP";
                    break;
                case 5:
                    baseCode = "JPY";
                    break;
                case 6:
                    baseCode = "AUD";
                    break;
                case 7:
                    baseCode = "CHF";
                    break;
                case 8:
                    baseCode = "CAD";
                    break;
                case 9:
                    baseCode = "CNY";
                    break;
                case 10:
                    baseCode = "ARS";
                    break;
                case 11:
                    baseCode = "TRY";
                    break;
                case 12:
                    baseCode = "BOB";
                    break;
                case 13:
                    baseCode = "CLP";
                    break;
                case 14:
                    baseCode = "COP";
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
            System.out.println("Converte para:");
            System.out.println("""
                    1 - Real Brasileiro (9BRL)
                    2 - Dólar Americano (USD)
                    3 - Euro (EUR)
                    4 - Libra esterlina (GBP)
                    5 - Iene (JPY)
                    6 - Dólar Australiano (AUD)
                    7 - Franco Suíço (CHF)
                    8 - Dólar Canadense (CAD)
                    9 - Renminbi (Yuan) (CNY)
                    10 - Peso Argentino (ARS)
                    11 - Lira Turca (TRY)
                    12 - Boliviano boliviano (BOB)
                    13 - Peso chileno (CLP)
                    14 - Peso colombiano (COP)
                    """);
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    tagetCode = "BRL";
                    break;
                case 2:
                    tagetCode = "USD";
                    break;
                case 3:
                    tagetCode = "EUR";
                    break;
                case 4:
                    tagetCode = "GBP";
                    break;
                case 5:
                    tagetCode = "JPY";
                    break;
                case 6:
                    tagetCode = "AUD";
                    break;
                case 7:
                    tagetCode = "CHF";
                    break;
                case 8:
                    tagetCode = "CAD";
                    break;
                case 9:
                    tagetCode = "CNY";
                    break;
                case 10:
                    tagetCode = "ARS";
                    break;
                case 11:
                    tagetCode = "TRY";
                    break;
                case 12:
                    tagetCode = "BOB";
                    break;
                case 13:
                    tagetCode = "CLP";
                    break;
                case 14:
                    tagetCode = "COP";
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
            System.out.println("Digite o valor de desja conveter de "+baseCode+" para "+tagetCode+":");
            valorEntrada=entrada.nextDouble();
            Localizacao l = new Localizacao();
            Api api = new Api(baseCode, tagetCode, valorEntrada);
            double valorConvertido = api.inciaApi();
            String e =l.localizando(baseCode, valorEntrada );
            String s = l.localizando(tagetCode, valorConvertido);

                    api.inciaApi();
            System.out.println("o valor de "+ e +" convertido em é "+ s );

            System.out.println("Deseja fazer uma nova conversão?");
            System.out.println("1 - para sim 0 - para não");
            opcao = entrada.nextInt();
            if (opcao==0){
                break;
            }
        } while (opcao != 0);
    }

}
