package com.labanovich.dmdev.t1;

public abstract class Hero {
    private String name;
    private int damage;


    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);

}
