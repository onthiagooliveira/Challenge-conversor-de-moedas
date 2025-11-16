package br.com.one.interfaces;

import br.com.one.models.CurrencyQuote;

import java.io.IOException;

/**
 * Define o contrato para buscar a cotação de uma moeda
 * por seu código (ex: "USD", "EUR").
 */
public interface SearchQuote {

    /**
     * Busca a cotação atual de uma moeda específica via uma API externa.
     *
     * @param currencyCode O código ISO 4217 da moeda a ser buscada (ex: "USD").
     * @return Um objeto CurrencyQuote contendo os dados da cotação.
     * @throws IOException Se ocorrer um erro durante a comunicação com a API.
     */
    CurrencyQuote searchQuoteForCode(String currencyCode) throws IOException;
}
