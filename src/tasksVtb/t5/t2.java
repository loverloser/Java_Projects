package tasksVtb.t5;

public class t2 {
    public static void main(String[] args) {
        PhoneBook ph = new PhoneBook();
        ph.add("Nick", "1235");
        ph.add("John", "657");
        ph.add("one", "1235");
        ph.add("one", "453");
        ph.add("Mom", "65789");
        ph.add("Dad", "5435");
        ph.add("Granny", "1235454");
        ph.add("Brother", "5666");
        System.out.println(ph.get("one"));
    }

}

