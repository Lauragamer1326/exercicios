package exercicioJava;
import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro para a sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        // Inicialização das variáveis
        int primeiro = 0;
        int segundo = 1;

        // Exibição da sequência de Fibonacci até o número informado
        System.out.println("Sequência de Fibonacci até " + limite + ":");
        System.out.print(primeiro + " " + segundo + " ");

        int proximo;
        while ((proximo = primeiro + segundo) <= limite) {
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }

        // Fechar o scanner
        scanner.close();
    }
}
