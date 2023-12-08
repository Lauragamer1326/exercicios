package exercicioJava;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        // Fecha o Scanner, pois já não é mais necessário
        scanner.close();

        // Converte a idade para dias
        int idadeEmDias = converterParaDias(anos, meses, dias);

        // Exibe o resultado
        System.out.println("A pessoa tem aproximadamente " + idadeEmDias + " dias de vida.");
    }

    // Método para converter a idade para dias
    public static int converterParaDias(int anos, int meses, int dias) {
        // Considera que um ano tem 365 dias e um mês tem 30 dias (aproximadamente)
        return anos * 365 + meses * 30 + dias;
    }
}
