package exercicioJava;

public class exercicio47 {
    public static void main(String[] args) {
        // Inicialização da variável de controle
        int numero = 1;

        // Utilizando o loop while para exibir números ímpares de 1 a 50
        while (numero <= 50) {
            // Verifica se o número é ímpar antes de exibir
            if (numero % 2 != 0) {
                System.out.println(numero);
            }

            // Incrementa o número para a próxima iteração
            numero++;
        }
    }
}
