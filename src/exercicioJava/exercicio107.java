package exercicioJava;
import java.util.Scanner;

public class exercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a matriz 3x3
        int[][] matriz = new int[3][3];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando o produto dos elementos da diagonal secundária
        int produtoDiagonalSecundaria = 1;
        for (int i = 0; i < 3; i++) {
            produtoDiagonalSecundaria *= matriz[i][2 - i];
        }

        // Exibindo o resultado
        System.out.println("\nProduto dos elementos da diagonal secundária: " + produtoDiagonalSecundaria);

        // Fechar o scanner
        scanner.close();
    }
}
