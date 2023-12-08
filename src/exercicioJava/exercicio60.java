package exercicioJava;

public class exercicio60 {
    public static void main(String[] args) {
        int limite = 20;
        int contador = 0;
        int primeiroTermo = 0, segundoTermo = 1;

        // Exibição dos primeiros 20 números da sequência de Fibonacci usando do-while
        do {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;

            contador++;
        } while (contador < limite);
    }
}
