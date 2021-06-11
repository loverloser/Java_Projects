package com.labanovich.dmdev.t1;

public class Hero {
    private String name;


    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void attackEnemy(Enemy enemy, int damage) {
        enemy.takeDamage(damage);
    }

}
