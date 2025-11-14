package br.com.one.models;

/**
 * 🔹 {@code ConvertedCurrency} - Classe que armazena o resultado da conversão.
 *<p>
 *     Responsável por receber os dados da conversão do ExchangeRate-API.
 *</p>
 */

public record ConvertedCurrency(
        String result,
        long time_last_update_unix,
        String time_last_update_utc,
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result)
{}
