package com.labanovich.dmdev.Exceptions;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Написать метод, который в 50% случаев бросает исключение.
 * Вызвать этот метод в конструкции try-catch-finally. Протестировать
 * работу блока finally.
 */
public class t7 {
    private static Random random = new Random();

    public static void main(String[] args) {
        try{
            test();
        } catch (MyException | FileNotFoundException e){
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }

    public static void test() throws MyException, FileNotFoundException {
        int i = random.nextInt(2);
        if(i == 1){
            throw new MyException();
        }else throw new FileNotFoundException();
    }

}
