package exercicioJava;
import java.util.Scanner;

public class exercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarando um vetor para armazenar os 7 números
        int[] numeros = new int[7];

        // Loop for para ler os 7 números
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Calculando a média aritmética
        int soma = 0;
        for (int i = 0; i < 7; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / 7;

        // Exibindo a média
        System.out.println("Média aritmética: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
