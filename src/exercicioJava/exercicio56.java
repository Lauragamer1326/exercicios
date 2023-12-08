package exercicioJava;
import java.util.Scanner;

public class exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verificação se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            System.out.println("Divisores de " + numero + ":");

            int divisor = 1;

            // Loop do-while para encontrar e exibir os divisores
            do {
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            } while (divisor <= numero);

            // Fechar o scanner
            scanner.close();
        }
    }
}
