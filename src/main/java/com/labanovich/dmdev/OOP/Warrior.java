package com.labanovich.dmdev.OOP;

public class Warrior extends Hero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Warrior " + this.getName() + " аттакует врага");
    }

    public int getDamage() {
        return super.getDamage();
    }
}
