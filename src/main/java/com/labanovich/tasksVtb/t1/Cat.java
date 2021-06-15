package com.labanovich.tasksVtb.t1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        countOfAnimals++;
        this.runLimit = 200;
        this.swimLimit = 0;
    }

}
