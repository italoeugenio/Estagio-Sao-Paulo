package atividades.ex03.main;

import atividades.ex03.controller.Faturamento;

public class Main {
    public static void main(String[] args) {

        String caminhoArquivoJson = "C:/Users/italo.santana/OneDrive - cnj.jus.br/Área de Trabalho/Language/Estagio-Sao-Paulo/tecnica/src/atividades/ex03/dados/dados.json";
        Faturamento faturamento = new Faturamento();
        faturamento.processarFaturamento(caminhoArquivoJson);
    }
}
