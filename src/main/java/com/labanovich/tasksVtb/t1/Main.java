package com.labanovich.tasksVtb.t1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Jack"), new Cat("Chester"), new Tiger("Bon Jovi")};
        for(Animal animal : animals){
            animal.run(500);
            animal.swim(900);
        }

        System.out.println(Animal.countOfAnimals);
    }
}
