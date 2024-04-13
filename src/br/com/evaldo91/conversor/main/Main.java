package br.com.evaldo91.conversor.main;

import br.com.evaldo91.conversor.classes.Api;
import br.com.evaldo91.conversor.classes.Localizacao;
import br.com.evaldo91.conversor.classes.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        String baseCode = "";
        String tagetCode = "";
        double valorEntrada = 0;
        Menu menu =new Menu();

        System.out.println("Bem vindo selecione uma das opções ou 0 para sair:");


        int opcao;
        do {

            while (tagetCode.equals(baseCode)){

                System.out.println("Conveter de");
                menu.mostraMenu();
                opcao = entrada.nextInt();

                //Escolhendo a moeda para conversão

                baseCode = menu.menuEscolha(opcao);
                System.out.println("Voce deseja converter "+baseCode+ " para:");
                menu.mostraMenu();
                opcao = entrada.nextInt();
                tagetCode = menu.menuEscolha(opcao);
                if(tagetCode.equals(baseCode)){
                    System.out.println("Voce esta tentado converter mesma moerda de origem e de destino!");}

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
