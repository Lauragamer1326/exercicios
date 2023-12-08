package exercicioJava;
import java.util.Scanner;

public class exercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];

        // Leitura dos 7 números inteiros
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Exibição dos números pares
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
