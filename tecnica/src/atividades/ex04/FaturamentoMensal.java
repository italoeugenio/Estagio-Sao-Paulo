package atividades.ex04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FaturamentoMensal {
    public static void main(String[] args) {
        Map<String, Double> faturamento = new HashMap<>();

        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        Collection<Double> valoresDofaturamento = faturamento.values();

        double somaTotal = 0;
        for(Double numeros: valoresDofaturamento){
            somaTotal += numeros;
        }

        System.out.println(faturamento);
        System.out.println();
        System.out.println("Soma total: "+somaTotal);
        System.out.println();

        Set<Map.Entry<String, Double>> chaveValor = faturamento.entrySet();
        for (Map.Entry<String, Double> input : chaveValor) {
            String estado = input.getKey();
            double valor = input.getValue();
            double percentual = (valor / somaTotal) * 100;
            System.out.printf("Percentual de %s: %.2f%%", estado, percentual);
        }
    }
}
