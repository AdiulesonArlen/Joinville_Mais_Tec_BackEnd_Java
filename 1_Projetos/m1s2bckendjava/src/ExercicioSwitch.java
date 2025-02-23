import java.util.Scanner;

public class ExercicioSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o nível de condicionamento físico: \n" +
                "1. Iniciante\n" +
                "2. Intermediário\n" +
                "3. Avançado\n" +
                "4. Sair\n" +
                "Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Plano de treinamento Iniciante");
                break;
            case 2:
                System.out.println("Plano de treinamento Intermediário");
                break;
            case 3:
                System.out.println("Plano de treinamento Avançado");
                break;
            case 4:
                System.out.println("Saindo!");
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
