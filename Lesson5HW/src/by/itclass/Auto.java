package by.itclass;

public class Auto {
    private String model;
    private int maxSpeed;

    public Auto() {
    }

    public Auto(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getCost() {
        return maxSpeed * 100;
    }

    public void updateAuto() {
        maxSpeed += 10;
    }

    public void show() {
        System.out.println(model + ";" + maxSpeed + "Cost: " + getCost());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
