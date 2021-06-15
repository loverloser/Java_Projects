package com.labanovich.tasksVtb.t4;

import java.util.Arrays;

public class f1 {
    public static void main(String[] args) {
        Integer[] ar = {1,2,4,5,6};
        changePlaces(ar, 1,4);
        System.out.println(Arrays.toString(ar));
    }

    public static <T> void changePlaces(T[] arr, int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

