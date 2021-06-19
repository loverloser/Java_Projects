package com.labanovich.dmdev.t4.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> map = new HashMap<>();

    public void parking(Car car) {
        if (!map.containsKey(car)) {
            map.put(car, 1);
        } else {
            for (Map.Entry<Car, Integer> entry : map.entrySet()) {
                if (entry.getKey().equals(car)) {
                    map.put(car, entry.getValue() + 1);
                }
            }
        }
    }

    public void out(Car car) {
        if (map.containsKey(car)) {
            for (Map.Entry<Car, Integer> entry : map.entrySet()) {
                if (entry.getKey().equals(car)) {
                    map.put(car, entry.getValue() - 1);
                }
            }
        } else System.out.println("There isn't auto in garage");
    }

    public int how(Car car) {
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(car)) {
                return entry.getValue();
            }
        }
        return 0;
    }
}
