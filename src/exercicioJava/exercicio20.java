package exercicioJava;
import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args){
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Lê o número inteiro fornecido pelo usuário
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar e exibe o resultado
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
