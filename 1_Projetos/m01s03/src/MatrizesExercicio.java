import java.util.Scanner;

public class MatrizesExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1;
        matriz1 = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Linha " + linha + " & Coluna " + coluna + ": ");
                matriz1[linha][coluna] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz1[linha][coluna] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
