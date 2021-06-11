package com.labanovich.dmdev.t1;

public class Warrior extends Hero {
    private int damage;
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Warrior " + this.getName() + " аттакует врага");
    }

    public int getDamage() {
        return damage;
    }
}
