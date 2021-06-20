package com.labanovich.dmdev.StreamsEx;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("qweq", "1eqwetretr", "trgdfgdfgdfg", "23fgbddsd", "11qasd", "trgdfgdfgdfg",
                "trgdfgdfgdfg", "trgdfgdfgdfg", "trgdfgdfgdfg");
        long count = strings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
