public class Funcoes {
    public static void main(String[] args) {
        System.out.println(somaValores(9, 6));
        mostrarMensagem();

    }

    public static void mostrarMensagem() {
        System.out.println("I am a Java Dev!");
    }

    public static int somaValores(int valor1, int valor2) {
        int soma = valor1 + valor2;
        return soma;
    }
}