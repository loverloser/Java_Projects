package com.labanovich.dmdev.Exceptions;

/**
 * Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */
public class t3 {
    public static void main(String[] args) {
        try {
            test(2);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void test(int n) throws MyException {
        if (n > 1){
            throw new MyException("my Exception");
        }
    }
}
