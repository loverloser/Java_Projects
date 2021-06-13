package com.labanovich.dmdev.t1;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Archer " + this.getName() + " аттакует врага");
    }

    public int getDamage() {
        return super.getDamage();
    }

}
