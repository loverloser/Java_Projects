package com.labanovich.dmdev.Exceptions;

/**
 * Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class t5 {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e){
            try {
                throw new MyException("Becouse of ArithmeticException");
            } catch (MyException myException) {
                myException.printStackTrace();
            }
        }
    }
}
