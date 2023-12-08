package exercicioJava;
import java.util.Scanner;

public class exercico79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verifica se o número é não-negativo
        if (numero < 0) {
            System.out.println("Por favor, insira um número não-negativo.");
        } else {
            // Inicializa o fatorial como 1
            long fatorial = 1;

            // Calcula o fatorial usando o loop for
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        // Fechar o scanner
        scanner.close();
    }
}
