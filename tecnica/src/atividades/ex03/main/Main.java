package atividades.ex03.main;

import atividades.ex03.controller.Faturamento;

public class Main {
    public static void main(String[] args) {
        // Altere o caminho para o Absoluto caso não funcione.
        String caminhoArquivoJson = "atividades/ex03/dados/dados.json";
        Faturamento faturamento = new Faturamento();
        faturamento.processarFaturamento(caminhoArquivoJson);
    }
}
