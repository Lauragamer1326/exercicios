package exercicioJava;
import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura da idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verificação do direito ao voto
        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório!");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto facultativo!");
        } else {
            System.out.println("Você não tem direito ao voto!");
        }

        scanner.close();
    }
}
