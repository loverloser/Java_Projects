package com.labanovich.dmdev.StreamsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 10, 2, 3, 54, 5, 6, 7, 15, 15, 8));
        OptionalDouble average = integerList.stream()
                .filter(n -> n % 5 == 0)
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .average()
                .stream().average();
        average.ifPresent(System.out::println);

    }
}
