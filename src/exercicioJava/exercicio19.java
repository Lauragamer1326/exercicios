package exercicioJava;
import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args){
        // Cria um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Verifica se o aluno foi aprovado ou reprovado
        if (media >= 7.0) {
            System.out.println("O aluno foi aprovado! Média: " + media);
        } else {
            System.out.println("O aluno foi reprovado! Média: " + media);
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
