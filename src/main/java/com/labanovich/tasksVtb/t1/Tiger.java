package com.labanovich.tasksVtb.t1;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
        countOfAnimals++;
        this.runLimit = 2000;
        this.swimLimit = 600;
    }

}
