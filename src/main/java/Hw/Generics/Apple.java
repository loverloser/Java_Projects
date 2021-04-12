package Hw.Generics;

public class Apple extends Fruit {
    private double weight;

    public Apple() {
        this.weight = 1;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}
