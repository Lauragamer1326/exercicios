package exercicioJava;
import java.util.Scanner;

public class exercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        // Leitura dos 5 números inteiros
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Exibição na ordem inversa
        System.out.println("Números na ordem inversa:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Fechar o scanner
        scanner.close();
    }
}
