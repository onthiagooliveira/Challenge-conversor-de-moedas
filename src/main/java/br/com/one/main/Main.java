package br.com.one.main;

import br.com.one.models.Currency;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;

/**
 * A classe {@code Main} é o ponto de entrada da aplicação.
 *
 * <p>Esta classe demonstra a leitura e desserialização de uma lista de objetos {@link br.com.one.models.Currency}
 * a partir de um arquivo JSON ({@code allCurrencies.json}) usando a biblioteca Gson.</p>
 *
 * @author Thiago Oliveira
 * @since 2023-11-10 (Data de criação/última modificação)
 * @see br.com.one.models.Currency
 */


public class Main {
    /**
     * O método principal que inicia a execução da aplicação.
     *
     * <p>Configura o objeto Gson para impressão formatada, lê o conteúdo
     * do arquivo "allCurrencies.json", desserializa o JSON para uma
     * {@code List<Currency>} e imprime algumas informações no console.</p>
     *
     */
    public static void main(String[] args) {

        // Cria uma instância de Gson configurada para imprimir JSON formatado (Pretty Printing)
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            // Lê o arquivo JSON como uma ‘String’. O arquivo está no diretório raiz do projeto
            String jsonString = Files.readString(Path.of("allCurrencies.json"));

            // Define o tipo de Objeto: Lista de Currency -> List<Currency>
            // Este é um passo necessário para que Gson saiba o tipo genérico correto
            // para a desserialização (devido à eliminação de tipo em Java)
            Type listType = new TypeToken<List<Currency>>() {}.getType();

            // Desserializa a ‘String’ JSON para uma lista de objetos Currency
            List<Currency> localizedCurrencies = gson.fromJson(jsonString, listType);

            // Imprime uma mensagem de sucesso
            System.out.println("Moedas lidas com sucesso: ");

            // Imprime um elemento específico da lista para demonstração
            System.out.println("\nPrimeira Moeda");
            System.out.println(localizedCurrencies.get(55));


        } catch (IOException e) {
            // Captura e trata exceções de I/O (por exemplo, arquivo não encontrado).
            System.err.println("Erro ao ler o arquivo jSON: " + e.getMessage());
            e.printStackTrace();
        }


    }
}