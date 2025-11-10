package br.com.one.models;

public class Currency {
    /**
     * 🔹 Classe que representa uma moeda (meio de troca pela qual são efetuadas transações monterárias),
     * um ativo financeiro.
     * <p>
     * 🔹 Esta classe armazena informações básicas sobre uma moeda como código da moeda, nome da moeda e país.
     * Usamos códigos de moeda de três letras ISO 4217 - por exemplo, USD para dólares americanos, EUR para euros etc
     * </p>
     */
    private String currencyCode;
    private String currencyName;
    private String country;

    /**
     * 🔹Construtor completo da classe Currency.
     *
     */
    public Currency(String currencyCode, String currencyName, String country) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.country = country;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("""
                Dados da moeda \n
                Cod. Moeda      '%s'
                Nome Moeda       %s
                País             %s
                """, currencyCode, currencyName, country);
    }
}
