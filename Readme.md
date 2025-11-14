# 💵 Challenge ONE: Conversor de Moedas

Esta é a solução desenvolvida por mim para o **Desafio de Conversão de Moedas** proposto pelo programa **ONE (Oracle Next Education)**
em parceria com a Alura.

O objetivo principal foi aplicar e consolidar conhecimentos de **Java** e **Orientação a Objetos** em um cenário prático, desenvolvendo
uma aplicação que consome uma **API externa** de taxas de câmbio para realizar conversões monetárias em tempo real.

A aplicação foi estruturada seguindo boas práticas de código e modularidade, separando as responsabilidades de integração (**API**),
lógica de negócio (**Service**) e modelo de dados (**Models**).


## Funcionalidades

O conversor é capaz de:

* **Consumo de API:** Obtém as taxas de câmbio em tempo real de uma API externa (como a ExchangeRate-API).
* **Conversão Direta:** Realiza a conversão de um valor X de uma moeda de origem para uma moeda de destino.
* **Modelo de Dados:** Utiliza classes **Record** e **Interfaces** para modelar e desserializar (ler) a resposta **JSON** da API de forma eficiente (usando a biblioteca **Gson**).
* **Tratamento de Exceções:** Lida com possíveis erros de conexão ou de sintaxe JSON.



## Tecnologias e Conceitos

| Categoria | Detalhe |
| :--- | :--- |
| **Linguagem** | Java (versão **17+** recomendada) |
| **Biblioteca** | **Gson** (para serialização e desserialização de JSON) |
| **API de Câmbio** | ExchangeRate-API ou similar. |

### Conceitos Aplicados:

* Programação Orientada a Objetos (Classes, Interfaces)
* Tratamento de Exceções (`try-catch`, `throws IOException`)
* **Injeção de Dependência** (via Construtor)
* **Java Records** (para classes de modelo/imutáveis)