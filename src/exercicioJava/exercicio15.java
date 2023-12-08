package exercicioJava;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){
        // Cria um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário atual do funcionário
        System.out.print("Informe o salário atual do funcionário: ");

        // Lê o salário fornecido pelo usuário
        double salarioAtual = scanner.nextDouble();

        // Calcula o novo salário com um aumento de 15%
        double aumento = 0.15 * salarioAtual;
        double novoSalario = salarioAtual + aumento;

        // Exibe o novo salário
        System.out.println("O novo salário, com um aumento de 15%, é: " + novoSalario);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
