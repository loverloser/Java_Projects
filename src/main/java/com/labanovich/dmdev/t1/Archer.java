package com.labanovich.dmdev.t1;

public class Archer extends Hero {
    private static final int DAMAGE = 40;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy, int DAMAGE) {
        super.attackEnemy(enemy, DAMAGE);
        System.out.println("Archer " + this.getName() + " аттакует врага");
    }
}
