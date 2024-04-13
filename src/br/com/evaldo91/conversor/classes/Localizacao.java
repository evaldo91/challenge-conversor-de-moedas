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
                lingua ="us";
                pais="USA";

        }
        Locale locale = new Locale(lingua,pais);
        String valorString = NumberFormat.getCurrencyInstance(locale).format(valor);
        return valorString;

    }

}
