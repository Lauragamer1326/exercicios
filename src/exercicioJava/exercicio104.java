package exercicioJava;
import java.util.Scanner;

public class exercicio104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int linhas = 3;
        int colunas = 3;

        // Criando a matriz
        int[][] matriz = new int[linhas][colunas];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificando se a matriz é simétrica
        boolean simetrica = true;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Exibindo o resultado
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
