package com.labanovich.tasksVtb.t4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class f2{
    public static void main(String[] args) {
        String[] strArr = {"a","d","f","g","h","j"};
        System.out.println(convertToList(strArr));


    }

    public static <E> List<E> convertToList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
