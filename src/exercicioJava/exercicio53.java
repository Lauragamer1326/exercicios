package exercicioJava;

public class exercicio53 {
    public static void main(String[] args) {
        int numero = 2; // Iniciando com o primeiro número par

        do {
            System.out.println(numero);
            numero += 2; // Incrementando para o próximo número par
        } while (numero <= 50);
    }
}
