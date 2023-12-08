package exercicioJava;
import java.util.Scanner;

public class exercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5]; // Vetor para armazenar os números
        int maior = Integer.MIN_VALUE; // Inicializado com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializado com o maior valor possível

        // Loop para ler os números e encontrar o maior e o menor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verifica se o número é o maior ou o menor
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe o maior e o menor valor
        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);

        // Fechar o scanner
        scanner.close();
    }
}
