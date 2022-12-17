package week13_12_03_2022.Person.Cred1;

public class Login {
    public static void main(String[] args) {
        Credentials.getUsername();

        Credentials.getPassword();
        Credentials.setUsername("asdfgh");
        Credentials.setPassword("987654321");
        System.out.println(Credentials.getPassword() + " " + Credentials.getUsername());
    }



}