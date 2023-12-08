package exercicioJava;
import java.util.Scanner;

public class exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;  // Inicializa o contador
        int somaIdades = 0;  // Inicializa a soma das idades

        // Loop while para ler nome e idade de 5 pessoas
        while (contador <= 5) {
            System.out.print("Digite o nome da pessoa " + contador + ": ");
            String nome = scanner.next();

            System.out.print("Digite a idade da pessoa " + contador + ": ");
            int idade = scanner.nextInt();

            // Adiciona a idade à soma total
            somaIdades += idade;

            // Incrementa o contador
            contador++;
        }

        // Calcula a média das idades
        double mediaIdades = somaIdades / 5.0;

        // Exibe a média das idades
        System.out.println("A média das idades é: " + mediaIdades);

        // Fechar o scanner
        scanner.close();
    }
}
