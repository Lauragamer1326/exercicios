package exercicioJava;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

    // Criação de um objeto Scanner para a entrada de dados
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário o raio do círculo
        System.out.print("Digite o raio do círculo: ");
    double raio = scanner.nextDouble();

    // Calcula a área e o perímetro do círculo
    double area = Math.PI * Math.pow(raio, 2);
    double perimetro = 2 * Math.PI * raio;

    // Exibe os resultados
        System.out.println("Área do círculo: "+area);
        System.out.println("Perímetro do círculo: "+perimetro);

    // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
