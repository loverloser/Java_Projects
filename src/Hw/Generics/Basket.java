package Hw.Generics;

import java.util.ArrayList;
import java.util.List;

public class Basket <T extends Fruit> {
    private List<T> storage;

    public Basket() {
        this.storage = new ArrayList<>();
    }

    public double getWeight(){
        double result = 0;
        for (T thing : storage) {
            result += thing.getWeight();
        }
        return result;
    }

    public void add(T element){
        storage.add(element);
    }

    public int compare(Basket<?> anotherBox){
        return Double.compare(this.getWeight(), anotherBox.getWeight());
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dist){
        dist.storage.addAll(src.storage);
        src.storage.clear();
    }
}
