package exercicioJava;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 5;

        // Criando o vetor para armazenar os nomes
        String[] nomes = new String[tamanho];

        // Lendo os nomes
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibindo os nomes em ordem alfabética
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fechar o scanner
        scanner.close();
    }
}
