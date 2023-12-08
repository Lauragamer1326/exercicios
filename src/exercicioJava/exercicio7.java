package exercicioJava;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        // Criando um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o salário base
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        // Calculando a comissão (5% do salário base)
        double comissao = 0.05 * salarioBase;

        // Calculando o salário líquido (salário base + comissão)
        double salarioLiquido = salarioBase + comissao;

        // Exibindo o resultado
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Comissão (5%): R$" + comissao);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
