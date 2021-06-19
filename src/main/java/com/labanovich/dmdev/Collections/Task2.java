package com.labanovich.dmdev.Collections;

import java.util.*;

/**
 Написать метод countUnique, который принимает целочисленный
 списк в качестве параметра и возвращает количество уникальных
 целых чисел в этом списке.
 При получении пустого списка метод должен возвращать 0.
 Пример:
 [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        System.out.println(countUnique(list));
    }

    public static int countUnique(List<Integer> list){
        if(list.size() == 0){
            return 0;
        }
        else {
            Set<Integer> set = new HashSet<>(list);
            return set.size();
        }
    }
}
