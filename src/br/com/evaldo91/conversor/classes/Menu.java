package br.com.evaldo91.conversor.classes;

public class Menu {
    public String menu(int opcao){
        switch (opcao) {
            case 1:
                return "BRL";
                break;
            case 2:
                return "USD";
                break;
            case 3:
                return "EUR";
                break;
            case 4:
                return "GBP";
                break;
            case 5:
                return "JPY";
                break;
            case 6:
                return "AUD";
                break;
            case 7:
                return "CHF";
                break;
            case 8:
                return "CAD";
                break;
            case 9:
                return "CNY";
                break;
            case 10:
                return "ARS";
                break;
            case 11:
                return "TRY";
                break;
            case 12:
                return "BOB";
                break;
            case 13:
                return "CLP";
                break;
            case 14:
                return "COP";
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione novamente.");
                break;

        }



    }
}
