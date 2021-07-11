import by.itclass.Car;

public class Runner2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("White");
        car1.setMark("Audi");
        car1.setProducer("Germany");
        car1.setType("passenger");

        Car car2 = new Car("Kia", "freight", "Green", "Japan");
        System.out.println(car1.getMark() + ";" +
                car1.getType() + ";" +
                car1.getColor() + ";" +
                car1.getProducer());
        car2.show();
    }
}
