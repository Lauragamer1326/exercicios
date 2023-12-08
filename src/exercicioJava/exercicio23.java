package exercicioJava;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do mês ao usuário
        System.out.print("Digite o nome do mês: ");
        String nomeMes = scanner.nextLine();

        // Converte o nome do mês para minúsculas para facilitar a comparação
        nomeMes = nomeMes.toLowerCase();

        // Verifica a quantidade de dias com base no nome do mês
        int diasNoMes = obterDiasNoMes(nomeMes);

        // Exibe o resultado
        if (diasNoMes > 0) {
            System.out.println("O mês de " + nomeMes + " tem " + diasNoMes + " dias.");
        } else {
            System.out.println("Mês inválido. Por favor, digite um mês válido.");
        }

        // Fecha o scanner
        scanner.close();
    }

    // Função para obter a quantidade de dias no mês
    private static int obterDiasNoMes(String nomeMes) {
        switch (nomeMes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                return 31;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                return 30;
            case "fevereiro":
                return 28; // Considerando ano não bissexto
            default:
                return -1; // Valor para indicar um mês inválido
        }
    }
}
