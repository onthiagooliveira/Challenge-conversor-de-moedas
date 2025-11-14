package br.com.one.interfaces;

public interface DisplayMenu {

    public static String displayMenuOfOptions() {
        return String.format("""
                   
                        Quanto Vale | App
                   
                    1 - Exibir lista de moedas
                    2 - Converter moeda
                    0 - Encerrar
                   
                   ******************************
                   
                   Digite uma opção: 
                   """);
    }
}
