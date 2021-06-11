package com.labanovich.dmdev.t1;

public class Warrior extends Hero{
    private static final int DAMAGE = 50;
    public Warrior(String name){
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage){
        enemy.takeDamage(DAMAGE);
        System.out.println("Warrior " + this.getName() + " аттакует врага");
    }
}
