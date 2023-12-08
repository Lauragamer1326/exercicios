package exercicioJava;
import java.util.Scanner;

public class exercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro para exibir a tabuada: ");
        int numero = scanner.nextInt();

        // Exibição da tabuada até o décimo valor
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechar o scanner
        scanner.close();
    }
}
