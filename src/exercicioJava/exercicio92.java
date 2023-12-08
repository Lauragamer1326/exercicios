package exercicioJava;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor para armazenar os números
        int[] numeros = new int[5];

        // Lendo os números do usuário e armazenando no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenando o vetor em ordem decrescente
        Arrays.sort(numeros);
        int tamanho = numeros.length;

        for (int i = 0; i < tamanho / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[tamanho - i - 1];
            numeros[tamanho - i - 1] = temp;
        }

        // Exibindo os números em ordem decrescente
        System.out.println("Números em ordem decrescente:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Fechar o scanner
        scanner.close();
    }
}
