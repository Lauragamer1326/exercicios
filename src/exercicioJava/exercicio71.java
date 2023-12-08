package exercicioJava;
import java.util.Scanner;

public class exercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            System.out.println("Divisores de " + numero + ":");

            // Loop for para encontrar e exibir os divisores
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
