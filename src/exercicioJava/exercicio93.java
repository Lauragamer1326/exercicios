package exercicioJava;
import java.util.Scanner;

public class exercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor para armazenar os 10 números inteiros
        int[] numeros = new int[10];

        // Ler os 10 números inteiros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Contar quantos números estão no intervalo de 10 a 50
        int quantidadeNoIntervalo = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                quantidadeNoIntervalo++;
            }
        }

        // Exibir o resultado
        System.out.println("Quantidade de números no intervalo de 10 a 50: " + quantidadeNoIntervalo);

        // Fechar o scanner
        scanner.close();
    }
}
