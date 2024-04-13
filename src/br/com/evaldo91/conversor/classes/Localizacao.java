package br.com.evaldo91.conversor.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Localizacao {


    public String localizando(String code, double valor){
        String lingua = "";
        String pais = "";
        switch (code){
            case "BRL":
                lingua ="pt";
                pais = "BR";
                break;
            case "USD":
                lingua ="en";
                pais="US";
                break;

            case "EUR":
                lingua ="en";
                pais="US";
                break;

            case "GBP":
                lingua ="en";
                pais="GB";
                break;

            case "JPY":
                lingua ="ja";
                pais="JP";
                break;

            case "AUD":
                lingua ="en";
                pais="AU";
                break;

            case "CHF":
                lingua ="fr";
                pais="CH";
                break;

            case "CAD":
                lingua ="en";
                pais="CA";
                break;

            case "CNY":
                lingua ="sh";
                pais="CN";
                break;

            case "ARS":
                lingua ="es";
                pais="AR";
                break;

            case "TRY":
                lingua ="tr";
                pais="TR";
                break;

            case "BOB":
                lingua ="es";
                pais="BO";
                break;

            case "CLP":
                lingua ="es";
                pais="CO";
                break;

            case "COP":
                lingua ="en";
                pais="CA";
                break;

        }
        Locale locale = new Locale(lingua,pais);
        return NumberFormat.getCurrencyInstance(locale).format(valor);

    }

}
