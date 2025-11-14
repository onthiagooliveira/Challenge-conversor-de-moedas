package br.com.one.interfaces;

import br.com.one.controller.IntegrationExchangeRateAPI;
import br.com.one.models.ConvertedCurrency;
import com.google.gson.Gson;

import java.io.IOException;

public interface CurrencyConverter {

    ConvertedCurrency convert(String currencyCode, String currencyCodeTarget, double amount) throws IOException;
}
