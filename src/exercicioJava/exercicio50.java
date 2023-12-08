package exercicioJava;
import java.util.Scanner;

public class exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite o nome e a idade (ou digite 'fim' para encerrar):");

        // Loop while para ler dados até que o nome seja "fim"
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            // Verificar se o nome é "fim" para encerrar o loop
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // Adicionar a idade à soma e incrementar o contador
            somaIdades += idade;
            contador++;
        }

        // Calcular e exibir a média das idades
        if (contador > 0) {
            double mediaIdades = (double) somaIdades / contador;
            System.out.println("Média das idades: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
