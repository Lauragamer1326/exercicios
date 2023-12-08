package exercicioJava;
import java.util.Scanner;

public class exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Inicialização da variável de controle
        int i = 1;

        // Loop do-while para exibir a tabuada até o décimo valor
        do {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);

        // Fechar o scanner
        scanner.close();
    }
}
