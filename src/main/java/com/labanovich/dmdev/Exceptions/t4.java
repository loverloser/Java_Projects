package com.labanovich.dmdev.Exceptions;

/**
 * Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */
public class t4 {
    public static void main(String[] args) {
        test(2);
    }

    public static void test(int n) throws MyRuntimeException{
        if(n > 1){
            throw new MyRuntimeException("MyRuntime error");
        }
    }
}
