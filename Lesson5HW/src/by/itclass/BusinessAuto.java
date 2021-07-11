package by.itclass;

public class BusinessAuto extends Auto {

    public BusinessAuto() {
    }

    public BusinessAuto(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public int getCost() {
        return getMaxSpeed() * 250;
    }

    @Override
    public void updateAuto() {
        setMaxSpeed(getMaxSpeed() + 25);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }
}
