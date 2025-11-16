package br.com.one.controller;

import br.com.one.interfaces.CurrencyConverter;
import br.com.one.models.ConvertedCurrency;
import com.google.gson.Gson;

import java.io.IOException;

/**
 * 🔹Método que conecta à API.
 * <p>
 * Cria uma requisição HTTP GET, através da classe HTTPRequest,
 * envia para o endpoint especificado e verifica o resultado da resposta.
 * </p>
 */
public class CurrencyConverterService implements CurrencyConverter {

    private final IntegrationExchangeRateAPI api;
    private final Gson gson = new Gson();

    public CurrencyConverterService(IntegrationExchangeRateAPI api) {
        this.api = api;
    }

    @Override
    public ConvertedCurrency convert(String currencyCode, String currencyCodeTarget, double amount) throws IOException {
        String json = IntegrationExchangeRateAPI.connectExchangeRateAPI("/pair/" + currencyCode + "/" + currencyCodeTarget + "/" + amount);
        return gson.fromJson(json, ConvertedCurrency.class);
    }
}
