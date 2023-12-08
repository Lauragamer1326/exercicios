package exercicioJava;
import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args){
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Pedindo ao usuário para inserir o turno do aluno (M ou V)
        System.out.print("Digite o turno do aluno (M para Matutino, V para Vespertino): ");
        char turnoAluno = scanner.next().charAt(0);

        // Verificando o turno e exibindo a saudação correspondente
        if (turnoAluno == 'M' || turnoAluno == 'm') {
            System.out.println("Bom dia, " + nomeAluno + "!");
        } else if (turnoAluno == 'V' || turnoAluno == 'v') {
            System.out.println("Boa tarde, " + nomeAluno + "!");
        } else {
            System.out.println("Turno inválido. Insira M para Matutino ou V para Vespertino.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
