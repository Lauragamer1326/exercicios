package exercicioJava;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os três números
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();

        // Calcula a média aritmética
        double media = calcularMedia(numero1, numero2, numero3);

        // Exibe o resultado
        System.out.println("A média aritmética dos números é: " + media);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Função para calcular a média aritmética
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
