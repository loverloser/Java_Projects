package com.labanovich.tasksVtb.t1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        countOfAnimals++;
        this.runLimit = 500;
        this.swimLimit = 10;
    }

}
