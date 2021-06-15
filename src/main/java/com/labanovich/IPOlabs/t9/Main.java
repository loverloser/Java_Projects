package com.labanovich.IPOlabs.t9;

import java.util.*;


public class Main {
    public static void main(String[] args) {
    }

    public String firstTask(int a, int b, int a1, int b1) {
        double firstG = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double secondG = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        if (firstG > secondG) {
            return "Гиппотенуза 1 - больше";
        } else if (firstG < secondG) {
            return "Гиппотенуза 2 - больше";
        } else {
            return "Гиппотенузы равны";
        }
    }

    public String secondTask(String str) {
        //sort the string
        StringBuilder result = new StringBuilder();
        String[] arr = str.split(" ");
        Arrays.sort(arr);
        for (String s : arr) {
            result.append(s).append(" ");
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }
}
