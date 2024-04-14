package br.com.evaldo91.conversor.classes;

public class MoedaInfo {
    private String nomeMoeda;
    private String valorFormatado;

    public MoedaInfo(String nomeMoeda, String valorFormatado) {
        this.nomeMoeda = nomeMoeda;
        this.valorFormatado = valorFormatado;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public String getValorFormatado() {
        return valorFormatado;
    }
}