package exercicioJava;
import java.util.Scanner;

public class exercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0;
        int contPares = 0, contImpares = 0;

        // Leitura dos 5 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contPares++;
            } else {
                somaImpares += numeros[i];
                contImpares++;
            }
        }

        // Verificação se há números pares
        if (contPares > 0) {
            double mediaPares = (double) somaPares / contPares;
            System.out.println("Média dos números pares: " + mediaPares);
        } else {
            System.out.println("Não foram informados números pares.");
        }

        // Verificação se há números ímpares
        if (contImpares > 0) {
            double mediaImpares = (double) somaImpares / contImpares;
            System.out.println("Média dos números ímpares: " + mediaImpares);
        } else {
            System.out.println("Não foram informados números ímpares.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
