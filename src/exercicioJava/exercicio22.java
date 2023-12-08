package exercicioJava;
import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salário ao usuário
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Calcular o bônus com base no salário
        double bonus;
        if (salario > 2000) {
            bonus = salario * 0.10; // 10% de bônus
        } else {
            bonus = salario * 0.05; // 5% de bônus
        }

        // Exibir o resultado
        System.out.println("O valor do bônus é: R$" + bonus);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
