package exercicioJava;
import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Cálculo da média aritmética
        double media = (numero1 + numero2 + numero3) / 3.0;

        // Exibição da média
        System.out.println("Média: " + media);

        // Verificação da condição e exibição do resultado
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Fechar o scanner
        scanner.close();
    }
}
