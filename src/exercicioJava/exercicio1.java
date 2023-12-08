package exercicioJava;
import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args){

        Scanner escanner = new Scanner(System.in);

        // Criando um objeto Scanner para ler os números do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitando o primeiro número inteiro
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        // Solicitando o segundo número inteiro
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Realizando as operações
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        // Verificando se o segundo número é diferente de zero antes de realizar a divisão
        double divisao = (numero2 != 0) ? (double) numero1 / numero2 : Double.NaN;

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        // Exibindo a divisão apenas se o segundo número não for zero
        if (!Double.isNaN(divisao)) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        // Fechando o scanner
        scanner.close();
            }
        }