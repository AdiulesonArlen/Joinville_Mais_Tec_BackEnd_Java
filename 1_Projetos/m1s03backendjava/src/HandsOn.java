import java.util.Scanner;

public class HandsOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos;
        double[] medias;
        double mediaTurma = 0;

        System.out.println("Qual será a quantidade de alunos? ");
        int qtdAlunos = scanner.nextInt();
        scanner.nextLine();

        alunos = new String[qtdAlunos];
        medias = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Nome do Aluno: ");
            alunos[i] = scanner.nextLine();
            System.out.println("Média do aluno: ");
            medias[i] = scanner.nextDouble();
            scanner.nextLine();

            mediaTurma += medias[i];
        }
        System.out.println("Média da turma: " + mediaTurma / qtdAlunos);

        scanner.close();
    }
}
