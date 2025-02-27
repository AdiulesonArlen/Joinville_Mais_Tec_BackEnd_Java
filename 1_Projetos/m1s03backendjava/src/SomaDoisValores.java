import java.util.Scanner;

public class SomaDoisValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º valor: ");
        int valor1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o 2º valor: ");
        int valor2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("O Resultado da soma dos valores é: " + (valor1+valor2));

        scanner.close();
    }
}
