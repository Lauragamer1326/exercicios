package exercicioJava;
import java.util.Scanner;

public class exercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Converte o número para uma string para facilitar a manipulação dos dígitos
        String numeroString = Integer.toString(numero);

        // Exibe os dígitos separadamente usando um loop for
        System.out.println("Dígitos separadamente:");

        for (int i = 0; i < numeroString.length(); i++) {
            char digito = numeroString.charAt(i);
            System.out.println(digito);
        }

        // Fechar o scanner
        scanner.close();
    }
}
