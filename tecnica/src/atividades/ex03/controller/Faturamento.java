package atividades.ex03.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import atividades.ex03.model.FaturamentoDiario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    private static final String ARQUIVO_JSON = "./Estagio-Sao-Paulo/tecnica/src/atividades/ex03/dados/dados.json";

    public void processarFaturamento(String arquivoJson) {
        List<FaturamentoDiario> faturamentos = loadFaturamentoFromFile(arquivoJson);

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

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

        double mediaMensal = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;

        for (FaturamentoDiario faturamento : faturamentos) {
            double valor = faturamento.getValor();

            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }

    private List<FaturamentoDiario> loadFaturamentoFromFile(String arquivoJson) {
        List<FaturamentoDiario> faturamentos = new ArrayList<>();
        try {
            File file = new File(arquivoJson);

            if (!file.exists()) {
//                System.out.println("File not found at the path: " + file.getAbsolutePath());
                return faturamentos;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder jsonContent = readFromReader(reader);

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonContent.toString(), JsonObject.class);
            Type tipoListaFaturamento = new TypeToken<List<FaturamentoDiario>>() {}.getType();
            faturamentos = gson.fromJson(jsonObject.get("faturamentos"), tipoListaFaturamento);
        } catch (Exception e) {
            System.out.println(e);
        }
        return faturamentos;
    }

    private StringBuilder readFromReader(BufferedReader reader) throws IOException {
        StringBuilder jsonContent = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonContent.append(line);
        }
        reader.close();
        return jsonContent;
    }
}
