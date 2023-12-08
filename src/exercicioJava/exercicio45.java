package exercicioJava;

public class exercicio45 {
    public static void main(String[] args) {
        int n = 20;  // Número de termos desejados na sequência
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int contador = 0;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

        // Loop while para gerar os primeiros 20 números da sequência de Fibonacci
        while (contador < n) {
            System.out.print(primeiroTermo + ", ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;

            contador++;
        }
    }
}
