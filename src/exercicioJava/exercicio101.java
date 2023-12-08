package exercicioJava;
import java.util.Scanner;

public class exercicio101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo as dimensões da matriz
        int linhas = 4;
        int colunas = 4;

        // Criando a matriz para armazenar os números inteiros
        int[][] matriz = new int[linhas][colunas];

        // Lendo os elementos da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a média aritmética dos elementos
        double soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }
        double media = soma / (linhas * colunas);

        // Exibindo a matriz
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a média aritmética
        System.out.println("\nMédia aritmética dos elementos: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
