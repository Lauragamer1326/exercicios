package exercicioJava;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Troca dos valores
        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        // Exibição dos resultados
        System.out.println("Valores trocados:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        // Fechar o scanner
        scanner.close();
    }
}
