package exercicioJava;
import java.util.Scanner;

public class exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Variável para armazenar o valor original do número
        int numeroOriginal = numero;

        // Inicialização do loop
        while (numero != 0) {
            // Obtém o último dígito do número
            int digito = numero % 10;

            // Exibe o dígito
            System.out.println("Dígito: " + digito);

            // Remove o último dígito do número
            numero = numero / 10;
        }

        // Exibe o número original novamente
        System.out.println("Número original: " + numeroOriginal);

        // Fechar o scanner
        scanner.close();
    }
}
