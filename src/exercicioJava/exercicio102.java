package exercicioJava;
import java.util.Scanner;

public class exercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho das matrizes
        int linhas = 2;
        int colunas = 2;

        // Criando as matrizes
        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] produto = new int[linhas][colunas];

        // Lendo os elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        lerMatriz(scanner, matriz1);

        // Lendo os elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        lerMatriz(scanner, matriz2);

        // Calculando o produto das matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                produto[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        // Exibindo a primeira matriz
        System.out.println("\nMatriz 1:");
        exibirMatriz(matriz1);

        // Exibindo a segunda matriz
        System.out.println("\nMatriz 2:");
        exibirMatriz(matriz2);

        // Exibindo o produto das matrizes
        System.out.println("\nProduto das Matrizes:");
        exibirMatriz(produto);

        // Fechar o scanner
        scanner.close();
    }

    // Função para ler os elementos de uma matriz
    private static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Função para exibir os elementos de uma matriz
    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
