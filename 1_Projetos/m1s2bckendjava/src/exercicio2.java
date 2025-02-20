import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança!");
        } else if(idade >= 12 && idade <= 19) {
            System.out.println("Adolescente!");
        } else if (idade >= 20){
            System.out.println("Adulto!");
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
