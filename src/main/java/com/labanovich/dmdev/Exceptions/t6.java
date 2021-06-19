package com.labanovich.dmdev.Exceptions;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений.
 *           Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */

public class t6 {
    private static Random random = new Random();
    public static void main(String[] args) {
        try {
            test();
        } catch (InterruptedException | FileNotFoundException | MyException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws InterruptedException, FileNotFoundException, MyException {
        int a = random.nextInt(3);
        switch (a){
            case 0:
                throw new MyException();
            case 1:
                throw new FileNotFoundException();
            case 2:
                throw new InterruptedException();
            default:
                System.out.println("adsasdas");
                break;
        }
    }
}
