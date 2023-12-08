package exercicioJava;
import java.util.Scanner;

public class exercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 10;

        // Declarando o vetor para armazenar os números
        int[] numeros = new int[tamanho];

        // Variável para contar os números positivos
        int contadorPositivos = 0;

        // Lendo os 10 números inteiros
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verificando se o número é positivo
            if (numeros[i] > 0) {
                contadorPositivos++;
            }
        }

        // Exibindo a quantidade de números positivos
        System.out.println("Quantidade de números positivos: " + contadorPositivos);

        // Fechar o scanner
        scanner.close();
    }
}
