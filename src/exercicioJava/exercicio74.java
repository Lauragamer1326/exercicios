package exercicioJava;
import java.util.Scanner;

public class exercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int numeroPessoas = 5; // Defina o número desejado de pessoas

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            // Adiciona a idade à soma
            somaIdades += idade;

            // Consumir a quebra de linha pendente após a leitura da idade
            scanner.nextLine();
        }

        // Verifica se pelo menos uma pessoa foi inserida para evitar divisão por zero
        if (numeroPessoas > 0) {
            // Calcula a média das idades
            double mediaIdades = (double) somaIdades / numeroPessoas;

            // Exibe a média das idades
            System.out.println("Média das idades: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa inserida.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
