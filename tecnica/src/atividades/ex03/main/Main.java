package atividades.ex03.main;


import atividades.ex03.controller.Faturamento;

public class Main {
    public static void main(String[] args) {
        String arquivoJson = "src/atividades/ex03/dados/dados.json";

        Faturamento faturamento = new Faturamento();
        faturamento.processarFaturamento(arquivoJson);
    }
}
