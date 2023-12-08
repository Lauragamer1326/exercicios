package exercicioJava;
import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler input do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Solicita o salário do funcionário
        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        // Calcula quantos salários mínimos o funcionário recebe
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        // Exibe o resultado
        System.out.println("O funcionário recebe aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
