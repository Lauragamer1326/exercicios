package exercicioJava;
import java.util.Scanner;

public class exercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 3;
        int colunas = 3;

        // Criando a matriz para armazenar os números
        int[][] matriz = new int[linhas][colunas];

        // Lendo os valores da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Encontrando o menor valor na matriz
        int menorValor = encontrarMenorValor(matriz);

        // Exibindo o menor valor na matriz
        System.out.println("O menor valor na matriz é: " + menorValor);

        // Fechar o scanner
        scanner.close();
    }

    // Função para encontrar o menor valor na matriz
    private static int encontrarMenorValor(int[][] matriz) {
        int menorValor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }

        return menorValor;
    }
}
