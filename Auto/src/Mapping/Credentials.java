package Mapping;

public class Credentials {
    public Credentials(String login, String password) {
        System.out.println("Credential constructor call with parameters" + login + ", " + password);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        System.out.println("Credential.getLogin = " + login);
        return login;
    }

    public String getPassword() {
        // TODO: Add logging
        System.out.println("Credential.getPassword = " + password);
        return password;
    }

    private String login;
    private String password;
}


