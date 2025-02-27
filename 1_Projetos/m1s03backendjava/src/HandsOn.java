import java.util.Scanner;

public class HandsOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos;
        double[] medias;

        System.out.println("Quantidade de Alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine();

        alunos = new String[quantidadeAlunos];
        medias = new double[quantidadeAlunos];

        scanner.close();
    }
}
