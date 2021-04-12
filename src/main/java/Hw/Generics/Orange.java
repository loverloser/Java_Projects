package Hw.Generics;

public class Orange extends Fruit {
    private double weight;

    public Orange() {
        this.weight = 1.5;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}
