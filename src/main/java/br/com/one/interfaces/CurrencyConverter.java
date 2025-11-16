package br.com.one.interfaces;

import br.com.one.models.ConvertedCurrency;

import java.io.IOException;

public interface CurrencyConverter {

    ConvertedCurrency convert(String currencyCode, String currencyCodeTarget, double amount) throws IOException;
}
