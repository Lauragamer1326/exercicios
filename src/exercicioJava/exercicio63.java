package exercicioJava;
import java.util.Scanner;

public class exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Exibição dos dígitos usando do-while
        System.out.println("Dígitos do número:");

        // Inicialização da variável de controle
        int temp = numero;

        do {
            // Obtém o último dígito do número
            int digito = temp % 10;

            // Exibe o dígito
            System.out.println(digito);

            // Remove o último dígito do número
            temp = temp / 10;

        } while (temp != 0);

        // Fechar o scanner
        scanner.close();
    }
}
