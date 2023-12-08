package exercicioJava;
import java.util.Scanner;
import java.util.Arrays;

public class exercicio24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Colocando os números em um array
        int[] numeros = {numero1, numero2, numero3};

        // Ordenando o array
        Arrays.sort(numeros);

        // Exibindo os números em ordem crescente
        System.out.println("Números em ordem crescente: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
