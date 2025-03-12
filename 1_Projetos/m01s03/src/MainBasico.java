import java.util.Scanner;

public class MainBasico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Criando / Instanciando vetores
        int[] valores = new int[3];
        // valores[10, 20, 30]
        String[] nomes = new String[3];

        // double notas = new double[4]; -> Gera um erro de compilação
        // Inicializando vetores
        double notas[] = {4.5, 5.6, 9.6};
        boolean[] valores_logicos = {true, false, false};
        System.out.println(notas[0]);
        notas[0] = 7;
        System.out.println(notas[0]);

        System.out.println("Nome do usuário: ");
//        nomes[0] = scanner.nextLine();
//        System.out.println("Usuário: " + nomes[0]);
        System.out.println("Tamanho de notas: " + notas.length);
        System.out.println("Tamanho de nomes: " + nomes.length);

        System.out.println("---------------");
        System.out.println("Cadastro de Notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d Nota: ", (i+1));
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d Nota: %.1f\n", (i+1), notas[i]);
        }

        for(double nota: notas) {
            System.out.println("-> " + nota);
        }
        scanner.close();

    }
}
