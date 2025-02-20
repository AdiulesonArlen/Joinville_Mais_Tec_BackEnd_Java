import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        scanner.next(); // entrada até o espaço
        scanner.nextLine(); // entrada até a quebra de linha
        scanner.nextInt(); // entrada de tipo Inteiro
        scanner.nextDouble(); // entrada de tipo Double
        scanner.nextFloat(); // entrada de tipo Float
        scanner.nextBoolean(); // entrada de tipo Boolean
        */

//        System.out.print("Digite seu nome completo: ");
//        System.out.println("Seja muito bem-vindo, " + nomeCompleto + "!");

        System.out.println("CADASTRO DE USUÁRIO\nNome Completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("RELATÓRIO DO USUÁRIO");
        System.out.printf("Nome Completo: %s\nIdade: %d\nEndereço: %s", nomeCompleto, idade, endereco);


        scanner.close();
    }
}