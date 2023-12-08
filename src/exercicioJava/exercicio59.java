package exercicioJava;
import java.util.Scanner;

public class exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;

        do {
            // Leitura do nome
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();

            // Leitura da idade
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            // Atualização da soma das idades
            somaIdades += idade;

            // Incremento do contador
            contador++;

        } while (contador < 5);

        // Cálculo da média das idades
        double mediaIdades = (double) somaIdades / 5;

        // Exibição da média das idades
        System.out.println("Média das idades: " + mediaIdades);

        // Fechar o scanner
        scanner.close();
    }
}
