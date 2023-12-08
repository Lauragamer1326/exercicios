package exercicioJava;
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar o peso e a altura
        System.out.print("Digite o peso (em quilogramas): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Calcular o IMC
        double imc = calcularIMC(peso, altura);

        // Exibir o IMC e a classificação
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + classificarIMC(imc));

        scanner.close();
    }

    // Método para calcular o IMC
    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para classificar o IMC
    private static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }
}
