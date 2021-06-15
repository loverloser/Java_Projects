package com.labanovich.tasksVtb.t5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class t1 {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "a", "a", "c", "a", "d", "t", "aqw", "gfdg", "ag", "q", "z", "x"};

        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
    }
}
