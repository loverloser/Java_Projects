public class Runner1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box1.width = 10;
        box1.height = 20;
        box1.dept = 15;
        box2.width = 3;
        box2.height = 6;
        box2.dept = 9;
        box1.show();
        box2.show();
        System.out.println("box1 volume: " + box1.getVolume());
        System.out.println("box2 volume: " + box2.getVolume());
    }
}
