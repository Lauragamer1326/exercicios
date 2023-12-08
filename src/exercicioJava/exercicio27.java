package exercicioJava;
import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (M ou F): ");
        char sexo = scanner.next().charAt(0);

        if ((sexo == 'M' || sexo == 'm') && idade >= 65) {
            System.out.println("Você pode se aposentar!");
        } else if ((sexo == 'F' || sexo == 'f') && idade >= 60) {
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você ainda não pode se aposentar.");
        }

        scanner.close();
    }
}
