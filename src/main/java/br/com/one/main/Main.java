package br.com.one.main;

import br.com.one.controller.CurrencyConverterService;
import br.com.one.controller.IntegrationExchangeRateAPI;
import br.com.one.interfaces.DisplayMenu;
import br.com.one.models.ConvertedCurrency;
import br.com.one.models.Currency;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 * 🔹A classe {@code Main} é o ponto de entrada da aplicação.
 *
 * <p>Esta classe demonstra a leitura e desserialização de uma lista de objetos {@link br.com.one.models.Currency}
 * a partir de um arquivo JSON ({@code allCurrencies.json}) usando a biblioteca Gson.</p>
 *
 * @author Thiago Oliveira
 * @since 2023-11-10 (Data de criação/última modificação)
 * @see br.com.one.models.Currency
 */


public class Main implements DisplayMenu {

    public static void main(String[] args) throws IOException {

        // 🔹Cria uma instância de Gson configurada para imprimir JSON formatado (Pretty Printing)
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            // 🔹 Lê o arquivo JSON como uma ‘String’. O arquivo está no diretório raiz do projeto
            String jsonString = Files.readString(Path.of("allCurrencies.json"));

            // 🔹 Define o tipo de Objeto: Lista de Currency → List<Currency>
            // Este é um passo necessário para que Gson saiba o tipo genérico correto
            // para a desserialização (devido à eliminação de tipo em Java)
            Type listType = new TypeToken<List<Currency>>() {}.getType();

            //🔹 Desserializa a ‘String’ JSON para uma lista de objetos Currency
            List<Currency> localizedCurrencies = gson.fromJson(jsonString, listType);

            // 🔹Organizan a lista alfabeticamente
            localizedCurrencies.sort(Comparator.comparing(Currency::getCurrencyCode));


            do {
                // 🔹 Cria o vínculo com a API
                IntegrationExchangeRateAPI api = new IntegrationExchangeRateAPI();

                // 🔹 Cria o serviço ce conversão usando a API
                CurrencyConverterService service = new CurrencyConverterService(api);

                // 🔹 Solicita a moeda de origem e a quantia a ser convertida
                System.out.print(DisplayMenu.displayMenuOfOptions());
                Scanner sc = new Scanner(System.in);
                int inputUser = sc.nextInt();
                sc.nextLine();

                switch (inputUser) {
                    case 1:
                        for (Currency c : localizedCurrencies) {
                            System.out.println(c);
                        }
                        break;

                    case 2:
                        System.out.println("Converter Moeda");
                        System.out.println("Informe o código da moeda de origem:");
                        String currencyCode = sc.nextLine().toUpperCase();

                        System.out.println("Informe o código da moeda destino:");
                        String currencyCodeTarget = sc.nextLine().toUpperCase();

                        System.out.println("Informe o valor:");
                        double amount = sc.nextDouble();
                        sc.nextLine(); // limpa BUFFER

                        // 🔹 Chama o método convert()
                        ConvertedCurrency resultFinal = service.convert(currencyCode, currencyCodeTarget, amount);

                        // 🔹 Exibe o resultado
                        System.out.printf("""
                        
                        Resultado da Conversão
                                %s → %s
                                 %.2f
                        
                        """, currencyCode, currencyCodeTarget, resultFinal.conversion_result());
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        return;

                    default:
                        System.out.println("Opção inválida!");
                    }
            } while (true);

        } catch (IOException e) {
            //🔹 Captura e trata exceções de I/O (por exemplo, arquivo não encontrado).
            System.err.println("Erro ao ler o arquivo jSON: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
