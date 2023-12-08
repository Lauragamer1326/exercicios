package exercicioJava;
import java.util.Scanner;

public class exercico3 {
    public static void main(String[] args){
        // Cria um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê a base do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        // Solicita e lê a altura do triângulo
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Fecha o Scanner, pois a leitura de dados foi concluída
        scanner.close();

        // Calcula a área do triângulo usando a fórmula: Área = (base * altura) / 2
        double area = (base * altura) / 2;

        // Exibe o resultado
        System.out.println("A área do triângulo é: " + area);
    }
}
