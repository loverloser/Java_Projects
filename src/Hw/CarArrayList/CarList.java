package Hw.CarArrayList;

public interface CarList {
    int size();
    boolean removeAt(int index);
    boolean remove(Car car);
    void add(Car car);
    Car get(int index);
    void clear();
}