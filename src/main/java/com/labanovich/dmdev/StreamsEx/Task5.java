package com.labanovich.dmdev.StreamsEx;

import java.util.Comparator;
import java.util.List;

/**
 * Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Sveta", "Svetikova", 26),
                new Person("Vlad", "Vladov", 15),
                new Person("Dima", "Dmitriev", 115),
                new Person("Maksim", "Maksimovich", 16));
        people.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
    }
}
