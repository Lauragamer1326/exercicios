package exercicioJava;
import java.util.Scanner;

public class exercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 3;
        int colunas = 3;

        // Criando a matriz para armazenar os números inteiros
        int[][] matriz = new int[linhas][colunas];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Encontrando o maior valor na matriz
        int maiorValor = matriz[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Exibindo o maior valor
        System.out.println("\nO maior valor na matriz é: " + maiorValor);

        // Fechar o scanner
        scanner.close();
    }
}
