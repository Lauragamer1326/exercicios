package exercicioJava;
import java.util.Scanner;

public class exercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Exibição da sequência de Fibonacci até o número informado
        System.out.println("Sequência de Fibonacci até " + numero + ":");

        int fibonacciAnterior = 0;
        int fibonacciAtual = 1;

        for (int i = 1; fibonacciAtual <= numero; i++) {
            System.out.print(fibonacciAtual + " ");

            // Atualiza os valores da sequência de Fibonacci
            int proximoFibonacci = fibonacciAnterior + fibonacciAtual;
            fibonacciAnterior = fibonacciAtual;
            fibonacciAtual = proximoFibonacci;
        }

        // Fechar o scanner
        scanner.close();
    }
}
