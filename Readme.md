# <img width="40" height="40" alt="image" src="https://github.com/user-attachments/assets/c0ebad34-e5a2-4d33-a36f-d259f4e15918" /> Challenge ONE: Conversor de Moedas

Esta é a solução desenvolvida por mim para o **Desafio de Conversão de Moedas** proposto pelo programa **ONE (Oracle Next Education)**
em parceria com a Alura.

O objetivo principal foi aplicar e consolidar conhecimentos de **Java** e **Orientação a Objetos** em um cenário prático, desenvolvendo
uma aplicação que consome uma **API externa** de taxas de câmbio para realizar conversões monetárias em tempo real.

A api utilizada foi a Exchange Rate API, https://www.exchangerate-api.com/, aproveito este espaço para deixar meu agradecimento pela disponibilização.

A aplicação foi estruturada seguindo boas práticas de código e modularidade, separando as responsabilidades de integração (**API**),
lógica de negócio (**Service**) e modelo de dados (**Models**).



## Funcionalidades

O conversor é capaz de:

* **Consumo de API:** Obtém as taxas de câmbio em tempo real de uma API externa (como a ExchangeRate-API).
* **Conversão Direta:** Realiza a conversão de um valor X de uma moeda de origem para uma moeda de destino.
* **Busca Direta:** Realiza a busca de uma cotação de moeda através do seu código.
* **Modelo de Dados:** Utiliza classes **Record** e **Interfaces** para modelar e desserializar (ler) a resposta **JSON** da API de forma eficiente (usando a biblioteca **Gson**).
* **Tratamento de Exceções:** Lida com possíveis erros de conexão ou de sintaxe JSON.



## Tecnologias e Conceitos

| Categoria | Detalhe |
| :--- | :--- |
| **Linguagem** | Java (versão **17+** recomendada) |
| **Biblioteca** | **Gson** (para serialização e desserialização de JSON) |
| **API de Câmbio** | ExchangeRate-API. |



### Conceitos Aplicados:

* Programação Orientada a Objetos (Classes, Interfaces)
* Tratamento de Exceções (`try-catch`, `throws IOException`)
* **Injeção de Dependência** (via Construtor)
* **Java Records** (para classes de modelo/imutáveis)


### Demonstração:

* Lista de moedas disponíveis e suas informações<br>
![lista-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/a5009977-4546-4b02-ba4f-d6a5c323a78e)<br>

* Conversão de moeda<br>
![conversao-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/0815e338-32f8-47f7-a24b-daa5d8554002)<br>

* Buscar cotação por código<br>
![buscarcotacao](https://github.com/user-attachments/assets/033e0274-5e18-4cb3-82b0-7efa02c66ab7)



