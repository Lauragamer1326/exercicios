package exercicioJava;
import java.util.Scanner;

public class exercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo um vetor para armazenar os 5 números
        int[] numeros = new int[5];

        // Lendo os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Contando quantos números são pares
        int quantidadePares = 0;
        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        // Exibindo o resultado
        System.out.println("Quantidade de números pares: " + quantidadePares);

        // Fechando o scanner
        scanner.close();
    }
}
