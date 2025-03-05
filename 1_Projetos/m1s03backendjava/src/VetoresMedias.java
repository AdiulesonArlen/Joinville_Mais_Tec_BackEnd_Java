import java.util.Scanner;

public class VetoresMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[3];
        int somaNotas = 0;
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite uma nota: ");
            notas[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
            media = (somaNotas / notas.length);
        }

        System.out.println(media);

        scanner.close();
    }
}
