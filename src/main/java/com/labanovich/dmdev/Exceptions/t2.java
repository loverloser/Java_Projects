package com.labanovich.dmdev.Exceptions;

/**
 * Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */

public class t2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }


}
