package exercicioJava;
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args){
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando a idade ao usuário
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        // Fechando o scanner após a leitura
        scanner.close();

        // Classificando a idade e exibindo a mensagem correspondente
        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
