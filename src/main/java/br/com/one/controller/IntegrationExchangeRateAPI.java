package br.com.one.controller;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 🔹 {@code IntegrationExchangeRateAPI} - Realiza a conexão com a API Exchange Rate API.
 *<p>
 *     Responsável por validar a conectividade e o ‘token’ de autenticação.
 *     Utilizado boas práticas de consumo de API REST em Java 11+, utilizando a classe {@link java.net.http.HttpClient}.
 *</p>
 */
public class IntegrationExchangeRateAPI {

    // 🔹Obtém o arquivo .env, que contém configurações sensíveis da API
    static Dotenv dotenv = Dotenv.load();

    // 🔹 Obtém a URL base e a API Key necessárias
    static String apiUrl = dotenv.get("EXCHANGERATE_BASE_URL");
    static String apiKey = dotenv.get("API_KEY");

    /**
     * 🔹Método que conecta à API.
     * <p>
     * Cria uma requisição HTTP GET, através da classe HTTPRequest,
     * envia para o endpoint especificado e verifica o resultado da resposta.
     * Utiliza try catch para capturar e tratar exceções.
     * </p>
     */
    public static String connectExchangeRateAPI(String route) throws IOException {

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl + apiKey + route))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                throw new IOException("Erro ao conectar ExchangeRate API: " + response.statusCode());
            }

        } catch (InterruptedException e) {
            throw new IOException("Erro na requisição", e);
        }
    }
}
