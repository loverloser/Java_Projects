package com.labanovich.dmdev.t1;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Enemy enemy1 = new Enemy(40);
        Hero hero = new Archer("Legolas", 40);
        Hero hero1 = new Warrior("Grey Gerold", 15);
        hero.attackEnemy(enemy);
        hero.attackEnemy(enemy);
        hero.attackEnemy(enemy);
        hero1.attackEnemy(enemy1);
        System.out.println(enemy.isAlive());
    }
}
