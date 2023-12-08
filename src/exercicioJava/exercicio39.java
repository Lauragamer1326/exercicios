package exercicioJava;
import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        // Loop while para ler 5 números
        while (contador < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Adiciona o número à soma
            soma += numero;

            // Incrementa o contador
            contador++;
        }

        // Calcula a média aritmética
        double media = soma / 5.0;

        // Exibe a média aritmética
        System.out.println("Média: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
