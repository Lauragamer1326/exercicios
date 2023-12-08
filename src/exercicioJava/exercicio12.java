package exercicioJava;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        // Cria um scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso da pessoa
        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // Solicita a altura da pessoa
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        // Fecha o scanner após obter as entradas
        scanner.close();

        // Calcula o IMC
        double imc = calcularIMC(peso, altura);

        // Exibe o resultado
        System.out.println("O Índice de Massa Corporal (IMC) é: " + imc);
    }

    // Função para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        // Fórmula do IMC: peso / (altura * altura)
        return peso / (altura * altura);
    }
}
