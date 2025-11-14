package br.com.one.models;

/**
     * 🔹Classe que representa a moeda alvo da conversão.
     * <p>
     * 🔹Essa classe armazena informações herdadas da classe Currency, é a moeda resultado da conversão monetária.
     * </p>
     */

public class TargetCurrency extends Currency{
    private String currencyCodeTarget;


    public TargetCurrency(String targetCurrency) {
        this.currencyCodeTarget = targetCurrency;
    }

    public String getCurrencyCodeTarget() {
        return currencyCodeTarget;
    }

    public void setCurrencyCodeTarget(String currencyCodeTarget) {
        this.currencyCodeTarget = currencyCodeTarget;
    }
}
