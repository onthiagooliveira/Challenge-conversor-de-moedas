package br.com.one.models;

public class Currency {
    /**
     * Classe que representa uma moeda (meio de troca pela qual são efetuadas transações monterários),
     * um ativo financeiro.
     * <p>
     * Esta classe armazena informações básicas sobre uma moeda como código da moeda e valor.
     * Usamos códigos de moeda de três letras ISO 4217 - por exemplo, USD para dólares americanos, EUR para euros etc
     * </p>
     */
    private String currencyCode;
    private double value;

    /**
     * Construtor completo da classe Currency.
     *
     * @param currencyCode  código da moeda
     * @param value         valor da moeda
     */
    public Currency(String currencyCode, double value) {
        this.currencyCode = currencyCode;
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
