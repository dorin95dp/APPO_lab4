public class Main {

    public static void main(String[] args) {

        User vasea = new User();
        vasea.name = "Jora";
        vasea.password = "password";
        vasea.status = "normal";

        vasea.sendLogin();

        if (vasea.loggedIn) {
            System.out.println("Login successful - use the application");
        } else {
            System.out.println("Login Failed");
        }

    }

}
