package exercicioJava;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        // Criação do scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada de multiplicação até o décimo valor
        System.out.println("Tabuada de multiplicação para " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
