package atividades.ex05;

public class InverterString {
    public static void inverterString(String palavra){
        System.out.println("Palavra original: " + palavra);

        System.out.print("Palavra invertida: ");
        for(int x = palavra.length() - 1; x >= 0; x--){
            System.out.print(palavra.charAt(x));
        }
    }

    public static void main(String[] args) {
        String palavra = "São Paulo";
        inverterString(palavra);
    }
}
