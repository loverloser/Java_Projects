package com.labanovich.tasksVtb.t1;

public  class Animal {
    private String name;
    protected static int countOfAnimals = 0;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        countOfAnimals++;
        this.name = name;
    }

    public void run(int distance){
        if(this.runLimit == 0){
            System.out.println(this.name + "НЕ умеет бегать");
        }else if(distance > this.runLimit){
            System.out.println(this.getName() + " Не смог пробежать " + distance);
        }else{
            System.out.println(this.getName() + " Пробежал " + distance);
        }
    }

    public void swim(int distance){
        if (this.swimLimit == 0){
            System.out.println(this.name + "НЕ умеет плавать");
        }else if(distance > this.swimLimit){
            System.out.println(this.getName() + " Не смог проплыть " + distance);
        }else{
            System.out.println(this.getName() + " проплыл " + distance);
        }

    }
}
