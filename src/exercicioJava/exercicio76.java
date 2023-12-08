package exercicioJava;
import java.util.Scanner;

public class exercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int somaPares = 0;

        // Loop for para somar os números pares entre 1 e o número lido
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        // Exibição da soma dos números pares
        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + somaPares);

        // Fechar o scanner
        scanner.close();
    }
}
