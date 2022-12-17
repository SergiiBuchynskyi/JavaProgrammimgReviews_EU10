package week13_12_03_2022.Person.Cred1;

public class Credentials {



    private static String username, password;
    static {
        username = "qwe";
        password = "123";


    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Credentials.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Credentials.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
