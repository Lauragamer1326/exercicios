package exercicioJava;
import java.util.Scanner;

public class exercicio108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 4;
        int colunas = 4;

        // Criando a matriz para armazenar os números inteiros
        int[][] matriz = new int[linhas][colunas];

        // Lendo os valores da matriz
        System.out.println("Digite os valores da matriz 4x4:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo o maior valor por linha
        for (int i = 0; i < linhas; i++) {
            int maiorValor = matriz[i][0]; // Assume que o primeiro valor da linha é o maior

            for (int j = 1; j < colunas; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }

            System.out.println("Maior valor na linha " + i + ": " + maiorValor);
        }

        // Fechar o scanner
        scanner.close();
    }
}
