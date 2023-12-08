package exercicioJava;

public class exercicio62 {
    public static void main(String[] args) {
        int numero = 1;

        // Loop do-while para exibir números ímpares de 1 a 50
        do {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 50);
    }
}
