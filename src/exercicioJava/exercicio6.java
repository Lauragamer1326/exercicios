package exercicioJava;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        // Criando um objeto Scanner para a entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Lendo o número inteiro fornecido pelo usuário
        int numero = scanner.nextInt();

        // Verificando se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
