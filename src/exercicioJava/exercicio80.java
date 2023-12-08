package exercicioJava;
import java.util.Scanner;

public class exercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contadorPessoas = 0;

        // Loop for para ler nome e idade até que o nome "fim" seja informado
        for (;;) {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break; // Sai do loop quando o nome for "fim"
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            // Adiciona a idade à soma e incrementa o contador
            somaIdades += idade;
            contadorPessoas++;
            scanner.nextLine(); // Consumir a quebra de linha pendente
        }

        // Verifica se pelo menos uma pessoa foi inserida para evitar divisão por zero
        if (contadorPessoas > 0) {
            // Calcula a média das idades
            double mediaIdades = (double) somaIdades / contadorPessoas;

            // Exibe a média das idades
            System.out.println("Média das idades: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa inserida.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
