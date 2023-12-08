package exercicioJava;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação dos números em ordem crescente
        Arrays.sort(numeros);

        // Exibição dos números ordenados
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Fechar o scanner
        scanner.close();
    }
}
