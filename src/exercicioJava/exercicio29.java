package exercicioJava;
import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Solicita a nota do aluno
        System.out.print("Digite a nota do aluno: ");
        double notaAluno = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Verifica se o aluno está aprovado ou em recuperação
        if (notaAluno >= 7) {
            System.out.println(nomeAluno + " está aprovado!");
        } else {
            System.out.println(nomeAluno + " está em recuperação.");
        }
    }
}
