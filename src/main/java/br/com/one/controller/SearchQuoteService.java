package br.com.one.controller;

import br.com.one.models.CurrencyQuote;
import com.google.gson.Gson;
import br.com.one.interfaces.SearchQuote;
import java.io.IOException;

/**
 * 🔹Método que conecta à API.
 * <p>
 * Cria uma requisição HTTP GET, através da classe HTTPRequest,
 * envia para o endpoint especificado e verifica o resultado da resposta.
 * </p>
 */

public class SearchQuoteService implements SearchQuote{
    private final IntegrationExchangeRateAPI api;
    private final Gson gson = new Gson();

    public SearchQuoteService(IntegrationExchangeRateAPI api) {
        this.api = api;
    }

    // Herda o método da interface
    @Override
    public CurrencyQuote searchQuoteForCode(String currencyCode) throws IOException {
        String json = IntegrationExchangeRateAPI.connectExchangeRateAPI("/latest/"+currencyCode);
        return gson.fromJson(json, CurrencyQuote.class);
    }
}
