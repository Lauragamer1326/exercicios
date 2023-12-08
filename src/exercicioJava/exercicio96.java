package exercicioJava;
import java.util.Scanner;

public class exercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo as dimensões da matriz
        int linhas = 3;
        int colunas = 3;

        // Criando a matriz para armazenar os números inteiros
        int[][] matriz = new int[linhas][colunas];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz na tela
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Nova linha para cada linha da matriz
        }

        // Fechar o scanner
        scanner.close();
    }
}
