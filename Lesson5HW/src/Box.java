public class Box {
    double width;
    double height;
    double dept;

    public double getVolume(){
        return width * height * dept;
    }

    public void show(){
        System.out.println(width + ";" + height + ";" + dept);
    }
}
