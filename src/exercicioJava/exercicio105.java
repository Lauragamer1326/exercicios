package exercicioJava;
import java.util.Scanner;

public class exercicio105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 4;
        int colunas = 4;

        // Criando a matriz para armazenar os números inteiros
        int[][] matriz = new int[linhas][colunas];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz digitada:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculando e exibindo a soma dos elementos de cada coluna
        System.out.println("\nSoma dos elementos de cada coluna:");

        for (int j = 0; j < colunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < linhas; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }

        // Fechar o scanner
        scanner.close();
    }
}
