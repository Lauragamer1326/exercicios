package exercicioJava;
import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Inicialização de variáveis para a verificação de primalidade
        int divisor = 2;
        boolean ehPrimo = true;

        // Verificação de primalidade usando o loop while
        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                // Se encontrarmos um divisor, o número não é primo
                ehPrimo = false;
                break;  // Saímos do loop, pois já sabemos que não é primo
            }
            divisor++;
        }

        // Exibição do resultado
        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
