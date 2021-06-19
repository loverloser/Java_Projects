package com.labanovich.dmdev.Exceptions;
/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class t1 {
    public static void main(String[] args) {
        Integer integer = null;
        if(integer == null){
            throw new NullPointerException();
        }
    }
}
