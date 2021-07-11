public class Runner {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.id = 1;
        user2.id = 2;
        user1.login = "Admin";
        user2.login = "Moder";
        System.out.println(user1.id + ";" + user1.login);
        System.out.println(user2.id + ";" + user2.login);
    }
}
