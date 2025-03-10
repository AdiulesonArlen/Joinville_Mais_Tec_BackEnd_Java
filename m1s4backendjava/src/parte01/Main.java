package parte01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user01 = new User();
        User user02 = new User();

        // inserir informações nos objetos
        user01.name = "Adam Vinícius";
        user01.email = "adamvinicius@email.com";
        user01.password = "123corri";

        user02.name = "Arthur Kennedy";
        user02.email = "arthurkennedy@email.com";
        user02.password = "123voei";

        System.out.println(user01.details());
        System.out.println(user02.details());

        System.out.println("---- TELA DE LOGIN ----");
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("Password: ");
        String password = scanner.next();

        System.out.println(user01.login(email, password) ? "Seja bem-vindo!" : "Email ou senha inválidos!");
    }
}
