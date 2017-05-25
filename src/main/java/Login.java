public class Login {
    protected String date;
    protected String number;

    static boolean confirm(String name, String password, String status) {

        if (status == "normal") {
            for (String nick : NormalLogin.names) {
                for (String pass : NormalLogin.passwords) {
                    if (name == nick && password == pass) {
                        return true;
                    }
                }
            }

            return false;
        } else {
            return (name == AdminLogin.name && password == AdminLogin.password);
        }
    }

}
