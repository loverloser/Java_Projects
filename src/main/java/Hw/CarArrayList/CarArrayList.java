package Hw.CarArrayList;

import java.util.Arrays;

public class CarArrayList implements CarList{
    private int size;
    private Car[] array = new Car[10];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean removeAt(int index) {
        check(index);
        if (array.length - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        size--;
        return true;
    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(car)){
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public void add(Car car) {
        if(array.length <= size){
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = car;
        size++;
    }

    @Override
    public Car get(int index) {
        check(index);
        return array[index];
    }

    @Override
    public void clear() {
        array = new Car[10];
        size = 0;
    }

    private void check(int index){
        if(index >= size || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
