package exercicioJava;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as três notas
        System.out.println("Digite a primeira nota (de 0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota (de 0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota (de 0 a 10): ");
        double nota3 = scanner.nextDouble();

        // Define os pesos para as notas
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        // Calcula a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Exibe o resultado
        System.out.println("A média ponderada é: " + mediaPonderada);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
