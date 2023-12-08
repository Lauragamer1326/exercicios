package exercicioJava;
import java.util.Scanner;

public class exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número
        System.out.print("Digite um número inteiro positivo maior que 1: ");
        int numero = scanner.nextInt();

        // Verificação se o número é um número primo
        boolean ehPrimo = true;
        int divisor = 2;

        // Utilizando do-while para verificar se há algum divisor além de 1 e o próprio número
        do {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break; // Se encontrou um divisor, não é primo, então saímos do loop
            }
            divisor++;
        } while (divisor <= numero / 2);

        // Exibição do resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
