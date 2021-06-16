package com.labanovich.dmdev.t3;

import java.util.List;
import java.util.ListIterator;

public class Main {
    private static final int TARGET_LENGTH = 4;
    private static final String TARGET_VALUE = "****";
    public static void main(String[] args) {

    }

    public static void markLength4(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_VALUE);
                listIterator.add(nextValue);
            }
        }
    }
}
