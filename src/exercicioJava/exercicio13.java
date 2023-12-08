package exercicioJava;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Verifica se o primeiro número é múltiplo do segundo
        if (ehMultiplo(numero1, numero2)) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

        // Fecha o scanner
        scanner.close();
    }

    // Função para verificar se um número é múltiplo de outro
    private static boolean ehMultiplo(int numero1, int numero2) {
        return numero1 % numero2 == 0;
    }
}
