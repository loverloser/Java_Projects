package com.labanovich.dmdev.t4.Car;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Mercedes("mersedes", "s110", 2005, "Green");
        Car mercedes1 = new Mercedes("mersedes", "s30", 2010, "Blue");
        Car bmw = new BMW("BMW", "X7", 2019, "White");
        Car bmw3 = new BMW("BMW", "X7", 2019, "White");
        Car bmw1 = new BMW("BMW", "X5", 2014, "Grey");
        Car tesla = new Tesla("Tesla", "ModelX", 2019, "White");
        Garage garage = new Garage();
        garage.parking(mercedes);
        garage.parking(mercedes1);
        garage.parking(bmw);
        garage.parking(bmw1);
        garage.parking(tesla);
        garage.parking(bmw3);
        System.out.println(garage.how(bmw));
    }
}
