package exercicioJava;
import java.util.Scanner;

public class exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Inicialização das variáveis
        int somaPares = 0;
        int i = 2;  // Começamos com o primeiro número par (2)

        // Loop while para somar os números pares até o número fornecido
        while (i <= numero) {
            somaPares += i;
            i += 2;  // Incremento para obter o próximo número par
        }

        // Exibição da soma dos números pares
        System.out.println("A soma dos números pares até " + numero + " é: " + somaPares);

        // Fechar o scanner
        scanner.close();
    }
}
