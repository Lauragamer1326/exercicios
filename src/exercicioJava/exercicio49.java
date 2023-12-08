package exercicioJava;
import java.util.Scanner;

public class exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Inicialização das variáveis
        int fatorial = 1;
        int i = 1;

        // Calculo do fatorial usando o loop while
        while (i <= numero) {
            fatorial *= i;
            i++;
        }

        // Exibição do resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // Fechar o scanner
        scanner.close();
    }
}
