package exercicioJava;
import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Inicialização da variável de controle do loop
        int divisor = 1;

        // Exibição dos divisores usando o loop while
        System.out.println("Divisores de " + numero + ":");

        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }

        // Fechar o scanner
        scanner.close();
    }
}
