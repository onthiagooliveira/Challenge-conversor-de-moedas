package br.com.one.models;

public class SourceCurrency extends Currency{
    /**
     * 🔹Classe que representa a moeda origem para conversão.
     * <p>
     * 🔹Essa classe armazena informações herdadas da classe Currency e adiciona a quantia base a
     * ser convertida.
     * </p>
     */

    private double amount;

    /**
     * 🔹Construtor completo da classe Currency.
     *
     * @param currencyCode
     * @param currencyName
     * @param country
     * @param amount
     *
     */
    public SourceCurrency(String currencyCode, String currencyName, String country, double amount) {
        super(currencyCode, currencyName, country);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
