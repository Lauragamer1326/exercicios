package exercicioJava;
import java.util.Scanner;

public class exercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 2;
        int colunas = 2;

        // Criando as duas matrizes
        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];

        // Lendo os elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        lerMatriz(scanner, matriz1);

        // Lendo os elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        lerMatriz(scanner, matriz2);

        // Verificando se as matrizes são iguais
        if (saoMatrizesIguais(matriz1, matriz2)) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes são diferentes.");
        }

        // Fechar o scanner
        scanner.close();
    }

    // Método para ler os elementos de uma matriz
    private static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para verificar se duas matrizes são iguais
    private static boolean saoMatrizesIguais(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false; // Se algum elemento for diferente, as matrizes não são iguais
                }
            }
        }
        return true; // Se nenhum elemento diferente foi encontrado, as matrizes são iguais
    }
}
