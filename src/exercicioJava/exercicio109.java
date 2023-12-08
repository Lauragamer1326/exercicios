package exercicioJava;
import java.util.Scanner;

public class exercicio109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int tamanho = 3;

        // Criando a matriz para armazenar os números
        int[][] matriz = new int[tamanho][tamanho];

        // Lendo os números para preencher a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificando se a matriz é uma matriz identidade
        boolean matrizIdentidade = true;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j && matriz[i][j] != 1) {
                    matrizIdentidade = false;
                    break;
                } else if (i != j && matriz[i][j] != 0) {
                    matrizIdentidade = false;
                    break;
                }
            }
        }

        // Exibindo o resultado
        if (matrizIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
