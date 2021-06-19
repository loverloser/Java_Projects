package com.labanovich.dmdev.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7));
        System.out.println(evenList(list));
    }

    public static List<Integer> evenList(List<Integer> list){
        list.removeIf(integer -> integer % 2 == 0);
        return list;
    }

}
