package exercicioJava;
import java.util.Scanner;

public class exercecio25 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de faltas
        System.out.print("Digite o número de faltas do aluno: ");
        int numeroDeFaltas = scanner.nextInt();

        // Verifica a situação do aluno com base no número de faltas
        if (numeroDeFaltas > 15) {
            System.out.println("Aluno reprovado por falta.");
        } else {
            System.out.println("Aluno aprovado.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
