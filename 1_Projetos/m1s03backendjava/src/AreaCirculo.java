import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio * raio);

        System.out.printf("A = %.2f\n", area);

        scanner.close();
    }
}