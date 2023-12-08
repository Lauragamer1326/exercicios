package exercicioJava;
import java.util.Scanner;

public class exercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 5;
        int soma = 0;

        // Loop for para ler 5 números inteiros
        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Adiciona o número à soma
            soma += numero;
        }

        // Calcula a média aritmética
        double media = (double) soma / totalNumeros;

        // Exibe a média
        System.out.println("Média aritmética: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
