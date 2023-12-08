package exercicioJava;
import java.util.Scanner;

public class exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();

        // Inicialização das variáveis para a sequência de Fibonacci
        int primeiro = 0, segundo = 1, proximo;

        // Exibição da sequência de Fibonacci até o número lido
        System.out.println("Sequência de Fibonacci até " + limite + ":");

        do {
            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        } while (primeiro <= limite);

        // Fechar o scanner
        scanner.close();
    }
}
