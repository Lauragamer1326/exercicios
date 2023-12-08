package exercicioJava;
import java.util.Scanner;

public class exercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo as dimensões da matriz
        int linhas = 2;
        int colunas = 2;

        // Criando a matriz para armazenar os números inteiros
        int[][] matriz = new int[linhas][colunas];

        // Lendo os elementos da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a soma dos elementos da matriz
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Exibindo a soma dos elementos da matriz
        System.out.println("\nSoma dos elementos da matriz: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}
