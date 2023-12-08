package exercicioJava;

public class exercicio37 {
    public static void main(String[] args){
        // Inicialização das variáveis
        int numero = 1;
        int soma = 0;

        // Loop while para somar os números de 1 a 100
        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        // Exibição da soma
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
