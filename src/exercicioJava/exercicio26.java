package exercicioJava;
import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Defina os preços dos produtos
        double precoProduto1 = 10.0;
        double precoProduto2 = 20.0;
        double precoProduto3 = 30.0;

        // Solicite o código do produto e a quantidade comprada
        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        // Calcula o valor total a ser pago com base no código do produto e na quantidade
        double valorTotal = 0.0;
        switch (codigoProduto) {
            case 1:
                valorTotal = precoProduto1 * quantidadeComprada;
                break;
            case 2:
                valorTotal = precoProduto2 * quantidadeComprada;
                break;
            case 3:
                valorTotal = precoProduto3 * quantidadeComprada;
                break;
            default:
                System.out.println("Código de produto inválido");
                return; // Encerra o programa se o código do produto for inválido
        }

        // Exibe o valor total a ser pago
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
