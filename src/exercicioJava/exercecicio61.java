package exercicioJava;
import java.util.Scanner;

public class exercecicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Inicialização das variáveis
        int soma = 0;
        int contador = 1; // Começamos do primeiro número ímpar

        // Loop do-while para somar os números pares
        do {
            // Se o número atual for par, adiciona à soma
            if (contador % 2 == 0) {
                soma += contador;
            }

            // Incrementa o contador para o próximo número
            contador++;
        } while (contador <= numero);

        // Exibição da soma
        System.out.println("A soma dos números pares até " + numero + " é: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}
