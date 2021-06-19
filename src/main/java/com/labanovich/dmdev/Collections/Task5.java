package com.labanovich.dmdev.Collections;
/**
 * 1. Задан текст на английском языке. Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(howMuchEngWords("qe qwe d d fdsf f ewr wer qwe qw eqw e wqe qwe f f s s a a a a wer"));
    }

    private static Map<String, Integer> howMuchEngWords(String src) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = src.split(" ");
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getKey().equals(s)) {
                        map.put(s, entry.getValue() + 1);
                    }
                }
            }

        }

        return map;
    }
}
