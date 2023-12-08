package exercicioJava;
import java.util.Scanner;

public class exercicio110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 2;
        int colunas = 2;

        // Criando as matrizes para armazenar os números
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];

        // Lendo os elementos da matrizA
        System.out.println("Digite os elementos da matriz A:");
        lerMatriz(scanner, matrizA);

        // Lendo os elementos da matrizB
        System.out.println("Digite os elementos da matriz B:");
        lerMatriz(scanner, matrizB);

        // Subtraindo as matrizes
        int[][] resultado = subtrairMatrizes(matrizA, matrizB);

        // Exibindo a subtração
        System.out.println("\nSubtração das matrizes A e B:");
        exibirMatriz(resultado);

        // Fechar o scanner
        scanner.close();
    }

    // Método para ler os elementos de uma matriz
    private static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para subtrair duas matrizes
    private static int[][] subtrairMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        return resultado;
    }

    // Método para exibir uma matriz
    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
