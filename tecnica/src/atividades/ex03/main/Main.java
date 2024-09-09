package atividades.ex03.main;


import atividades.ex03.controller.Faturamento;

public class Main {
    public static void main(String[] args) {
        final String arquivoJson = "./Estagio-Sao-Paulo";

        Faturamento faturamento = new Faturamento();
        faturamento.processarFaturamento(arquivoJson);
    }
}
