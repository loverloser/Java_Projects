package Hw;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int tailLength;

    public Cat(String name, int age, int weight, int tailLength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Cat" +
                "name is " + name + '\'' +
                ", age is " + age +
                ", weight is " + weight +
                ", tailLength is " + tailLength;
    }
}
