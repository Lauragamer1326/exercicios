package exercicioJava;
import java.util.Scanner;

public class exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 10;
        int[] numeros = new int[tamanho];

        // Leitura dos 10 números inteiros
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializando as somas
        int somaPositivos = 0;
        int somaNegativos = 0;

        // Calculando as somas
        for (int numero : numeros) {
            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        // Exibindo os resultados
        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);

        // Fechar o scanner
        scanner.close();
    }

}
