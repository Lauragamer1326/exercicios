package exercicioJava;
import java.util.Scanner;

public class exercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor para armazenar os números
        int[] numeros = new int[5];

        // Leitura dos 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Verifica se algum número é igual a zero
        boolean encontradoZero = false;
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == 0) {
                encontradoZero = true;
                break; // Se encontrar zero, não é necessário continuar verificando
            }
        }

        // Exibe o resultado
        if (encontradoZero) {
            System.out.println("Pelo menos um número é igual a zero.");
        } else {
            System.out.println("Nenhum número é igual a zero.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
