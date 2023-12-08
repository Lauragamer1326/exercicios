package exercicioJava;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o preço do produto
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        // Solicita a quantidade comprada
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        // Calcula o valor total
        double valorTotal;
        if (quantidade > 10) {
            // Aplica desconto de 10% se a quantidade for maior que 10 unidades
            valorTotal = preco * quantidade * 0.9;
        } else {
            // Sem desconto se a quantidade for 10 unidades ou menos
            valorTotal = preco * quantidade;
        }

        // Exibe o valor total a ser pago
        System.out.println("O valor total a ser pago é: R$" + valorTotal);

        // Fecha o Scanner
        scanner.close();
    }
}
