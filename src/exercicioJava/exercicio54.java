package exercicioJava;
import java.util.Scanner;

public class exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização das variáveis
        int soma = 0;
        int contador = 0;

        // Loop do-while para ler 5 números
        do {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Adiciona o número à soma
            soma += numero;

            // Incrementa o contador
            contador++;

        } while (contador < 5);

        // Cálculo da média aritmética
        double media = (double) soma / contador;

        // Exibição da média
        System.out.println("Média aritmética: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
