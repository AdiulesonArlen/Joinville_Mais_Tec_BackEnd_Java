import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();
        while (opcao != 4) {
            System.out.print("Escolha o nível de condicionamento físico: \n" +
                    "1. Iniciante\n" +
                    "2. Intermediário\n" +
                    "3. Avançado\n" +
                    "4. Sair\n" +
                    "Opção: ");
        }
        scanner.close();
    }
}
