package exercicioJava;
import java.util.Scanner;

public class exercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 2;
        int colunas = 2;

        // Criando as matrizes
        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] somaMatrizes = new int[linhas][colunas];

        // Lendo os elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        lerMatriz(scanner, matriz1);

        // Lendo os elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        lerMatriz(scanner, matriz2);

        // Calculando a soma das matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibindo a soma das matrizes
        System.out.println("Soma das matrizes:");
        exibirMatriz(somaMatrizes);

        // Fechar o scanner
        scanner.close();
    }

    // Método para ler os elementos de uma matriz
    private static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para exibir os elementos de uma matriz
    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
