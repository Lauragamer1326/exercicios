package exercicioJava;
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Chama a função para verificar o tipo do número e exibe o resultado
        verificarNumero(numero);
    }

    // Função para verificar se o número é positivo, negativo ou zero
    public static void verificarNumero(double numero) {
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
