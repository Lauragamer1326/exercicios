package exercicioJava;
import java.util.Scanner;

public class exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verificação se o número é não-negativo
        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            // Cálculo do fatorial usando do-while
            int resultado = 1;
            int i = 1;

            do {
                resultado *= i;
                i++;
            } while (i <= numero);

            // Exibição do resultado
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        // Fechar o scanner
        scanner.close();
    }
}
