package parte01;

public class User {
    // Atributos
    String name;
    String email;
    String password;

    // Métodos

    public String details() {
        return String.format("---- INFORMAÇÕES DO USUÁRIO ----" +
                "\nNome: %s" +
                "\nEmail: %s" +
                "\nPassword: ", name, email, password);
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
}
