package exercicioJava;
import java.util.Scanner;

public class exercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int tamanho = 3;

        // Criando a matriz para armazenar os números
        int[][] matriz = new int[tamanho][tamanho];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculando e exibindo a soma dos elementos da diagonal principal
        int somaDiagonal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonal);

        // Fechar o scanner
        scanner.close();
    }
}
