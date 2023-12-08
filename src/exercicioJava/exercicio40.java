package exercicioJava;
import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura do número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Inicialização da variável de controle
        int contador = 1;

        // Exibição da tabuada usando o while
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);

            // Incremento do contador
            contador++;
        }

        // Fechar o scanner
        scanner.close();
    }
}
