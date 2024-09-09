package atividades.ex03.controller;

import atividades.ex03.model.FaturamentoDiario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Faturamento {

    public void processarFaturamento(String arquivoJson) {
        try {
            // Ler o conteúdo do arquivo JSON
            BufferedReader br = new BufferedReader(new FileReader(arquivoJson));
            Gson gson = new Gson();
            Type tipoListaFaturamento = new TypeToken<List<FaturamentoDiario>>() {}.getType();
            List<FaturamentoDiario> faturamentos = gson.fromJson(br, tipoListaFaturamento);
            br.close();

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;
            int diasAcimaDaMedia = 0;

            // Loop para encontrar o menor e maior faturamento e somar o faturamento
            for (FaturamentoDiario faturamento : faturamentos) {
                double valor = faturamento.getValor();

                if (valor < menorFaturamento && valor > 0) {
                    menorFaturamento = valor;
                }

                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }

                if (valor > 0) {
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            // Calcular a média mensal, evitando divisão por zero
            double mediaMensal = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;

            // Contar os dias com faturamento acima da média
            for (FaturamentoDiario faturamento : faturamentos) {
                double valor = faturamento.getValor();

                if (valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibir os resultados
            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
