package br.com.one.models;

import java.util.Map;

public record CurrencyQuote(
        String result,
        long time_last_update_unix,
        String time_last_update_utc,
        String base_code,
        Map<String, Double> conversion_rates)
{}
