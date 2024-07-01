package student.examples.chat.entities;

import java.util.Date;

public class User {
    public String username;
    public String password;
    public Date dob;
    public char gender;
    public String email;

    public User(String username, String password, Date dob, char gender, String email) {
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }
}
