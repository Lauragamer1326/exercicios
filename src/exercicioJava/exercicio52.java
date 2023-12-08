package exercicioJava;

public class exercicio52 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        do {
            // Adiciona o número atual à soma
            soma += numero;

            // Incrementa o número para a próxima iteração
            numero++;

        } while (numero <= 100);

        // Exibe o resultado
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
