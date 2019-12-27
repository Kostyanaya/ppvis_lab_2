package model;

public class User {

    private String firstName;
    private String lastName;
    private String password;
    private String login;

    public User(String firstName, String lastName, String password, String login){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.login = login;
    }
}
