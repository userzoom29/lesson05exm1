import model.User;

public class Main1 {
    public static void main(String[] args) {

        String str1 = "str";

        User user1 = new User("Igor", "123");
        User user2 = new User("Vytya", "123");
        user1.info();
        user2.info();
        System.out.println("----------------------------------");
        User user3 = new User();
        user3.info();
        User user4 = new User("Masha");
        user4.info();
    }
}
