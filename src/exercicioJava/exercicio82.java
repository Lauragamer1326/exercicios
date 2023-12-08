package exercicioJava;
import java.util.Scanner;

public class exercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor para armazenar os números
        int[] numeros = new int[10];

        // Loop para ler os 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Calcula a soma dos números no vetor
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        // Exibe a soma
        System.out.println("A soma dos números é: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}
