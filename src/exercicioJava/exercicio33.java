package exercicioJava;
import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        char conceito = obterConceito(nota);

        System.out.println("Conceito do aluno: " + conceito);

        scanner.close();
    }

    public static char obterConceito(double nota) {
        char conceito;

        if (nota >= 9.0) {
            conceito = 'A';
        } else if (nota >= 7.0) {
            conceito = 'B';
        } else if (nota >= 5.0) {
            conceito = 'C';
        } else if (nota >= 3.0) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }

        return conceito;
    }
}
