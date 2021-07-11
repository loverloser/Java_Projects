package by.itclass;

public class Car {
    private String mark;
    private String type;
    private String color;
    private String producer;

    public Car() {
    }

    public Car(String mark, String type, String color, String producer) {
        this.mark = mark;
        this.type = type;
        this.color = color;
        this.producer = producer;
    }

    public void show() {
        System.out.println(mark + ";" +
                type + ";" +
                color + ";" +
                producer);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
