package atividades.ex02;

public class Fibonacci {
    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, c;
        if (num == a || num == b) {
            return true;
        }
        while (b <= num) {
            c = a + b;
            a = b;
            b = c;
            if (b == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numero = 21; // Escolha o número que queira verificar

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence a sequência");
        } else {
            System.out.println(numero + " não pertence a sequência");
        }
    }
}
