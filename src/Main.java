import student.examples.chat.entities.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            User user1 = new User();
            User user2 = new User();
            System.out.println(user1.username);
            System.out.println(user2.username);
            user1.username = "Dencik";
            System.out.println(user1.username);
            System.out.println(user2.username);
        }
    }
