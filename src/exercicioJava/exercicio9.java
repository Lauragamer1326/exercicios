package exercicioJava;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do depósito mensal
        System.out.print("Informe o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        // Solicita a taxa de juros mensal em porcentagem
        System.out.print("Informe a taxa de juros mensal (em %): ");
        double taxaJurosMensal = scanner.nextDouble() / 100;

        // Inicializa o montante com zero
        double montante = 0;

        // Calcula o montante após 12 meses
        for (int i = 0; i < 12; i++) {
            montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
        }

        // Exibe o resultado
        System.out.println("O montante após 12 meses é: " + montante);

        // Fecha o scanner
        scanner.close();
    }
}
