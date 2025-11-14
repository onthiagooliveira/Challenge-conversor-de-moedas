package br.com.one.models;

/**
     * 🔹Classe que representa a moeda alvo da conversão.
     * <p>
     * 🔹Essa classe armazena informações herdadas da classe Currency, é a moeda resultado da conversão monetária.
     * </p>
     */

public class TargetCurrency extends Currency{
    private String currencyCodeTarget;

    /**
     * 🔹Construtor completo da classe TergetCurrency
     *
     */
    public TargetCurrency(String targetCurrency) {
        this.currencyCodeTarget = targetCurrency;
    }

    // Getter
    public String getCurrencyCodeTarget() {
        return currencyCodeTarget;
    }

    // Setter
    public void setCurrencyCodeTarget(String currencyCodeTarget) {
        this.currencyCodeTarget = currencyCodeTarget;
    }
}
