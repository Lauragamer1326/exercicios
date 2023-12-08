package exercicioJava;

public class exercicio75 {
    public static void main(String[] args) {
        int n = 20; // Número de termos desejados

        // Inicialização dos dois primeiros termos da sequência de Fibonacci
        int termo1 = 0;
        int termo2 = 1;

        // Exibição dos primeiros 20 números da sequência de Fibonacci
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(termo1 + " ");

            // Calcula o próximo termo da sequência
            int proximoTermo = termo1 + termo2;

            // Atualiza os termos para o próximo ciclo do loop
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}
