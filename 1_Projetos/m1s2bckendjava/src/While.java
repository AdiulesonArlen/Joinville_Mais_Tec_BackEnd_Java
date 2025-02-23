import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        while (contador < 5) {
            System.out.println("Estou em execução!");
            contador++;
        }

        System.out.println("____________________________________");

        contador = 0;
        while (true){
            System.out.println("Estou em execução");
            if (contador == 4) {
                break;
            }
            contador++;
        }
        scanner.close();
    }
}
