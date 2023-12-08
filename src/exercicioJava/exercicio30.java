package exercicioJava;
import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args){
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe a quantidade de maçãs compradas
        System.out.print("Digite a quantidade de maçãs compradas: ");

        // Lê a quantidade de maçãs fornecida pelo usuário
        int quantidadeMacas = scanner.nextInt();

        // Fecha o scanner, pois não é mais necessário
        scanner.close();

        // Define o preço por maçã com base na quantidade comprada
        double precoPorMaca;
        if (quantidadeMacas < 12) {
            precoPorMaca = 0.50;
        } else {
            precoPorMaca = 0.40;
        }

        // Calcula o valor total a ser pago
        double valorTotal = quantidadeMacas * precoPorMaca;

        // Exibe o valor total a ser pago
        System.out.println("O valor total a ser pago é: R$ " + valorTotal);
    }
}
