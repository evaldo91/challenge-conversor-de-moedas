package br.com.evaldo91.conversor.main;

import br.com.evaldo91.conversor.classes.Menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static br.com.evaldo91.conversor.classes.Conversor.realizarConversao;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;

        System.out.println("Bem vindo! Selecione 1 para iniciar ou 0 para sair:");

        do {
            try {
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        realizarConversao(entrada, menu);

                        System.out.println("0 - Sim  1 - Nao" );
                        break;
                    case 0:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, selecione uma opção válida.");
                        System.out.println("Selecione 1 para reiniciar ou 0 para sair.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro. ");
                entrada.next(); // Limpar o buffer do scanner
                opcao = -1; // Definir opcao como -1 para continuar o loop
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (opcao != 0); // Repetir até que o usuário selecione a opção de sair (0)
        System.out.println("Teste");

        entrada.close();
    }



    }


