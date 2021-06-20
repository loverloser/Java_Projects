package com.labanovich.dmdev.StreamsEx;

import java.util.Map;

/**
 *  Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7
 * символов.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "mama", 1,
                "eqweqwe", 2,
                "dasdasd", 3,
                "rqewqe", 4,
                "sdfd", 19
        );
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
