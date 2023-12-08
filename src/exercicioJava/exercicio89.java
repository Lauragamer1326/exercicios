package exercicioJava;
import java.util.Scanner;

public class exercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do vetor
        int tamanho = 10;

        // Vetor para armazenar os números
        int[] numeros = new int[tamanho];

        // Contadores para positivos e negativos
        int positivos = 0;
        int negativos = 0;

        // Leitura dos números
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verifica se o número é positivo, negativo ou zero
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }

        // Exibição dos resultados
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);

        // Fechar o scanner
        scanner.close();
    }
}
