public class User {
    String name;
    String password;
    String status;

    boolean loggedIn = false;

    public void sendLogin() {
        loggedIn = Login.confirm(name, password, status);
    }

}
