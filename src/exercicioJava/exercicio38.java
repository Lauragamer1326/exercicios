package exercicioJava;

public class exercicio38 {
    public static void main(String[] args){
        // Inicialização da variável de controle
        int numero = 1;

        // Loop while para exibir números pares de 1 a 50
        while (numero <= 50) {
            // Verifica se o número é par
            if (numero % 2 == 0) {
                // Exibe o número par
                System.out.println(numero);
            }

            // Incrementa o número
            numero++;
        }
    }
}
