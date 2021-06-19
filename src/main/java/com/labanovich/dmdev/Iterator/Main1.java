package com.labanovich.dmdev.Iterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 2.	Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы

 */
public class Main1 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Tim", "abanovich", 17,8),
                new Student("rew", "cc", 17,4),
                new Student("qewqwe", "bhgh", 17,6),
                new Student("hjjj", "gc", 17,1)
        );
        list.sort(Comparator.comparing(Student::getSurName).thenComparing(Student::getName));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
