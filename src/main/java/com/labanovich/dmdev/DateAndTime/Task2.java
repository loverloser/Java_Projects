package com.labanovich.dmdev.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 */
public class Task2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String format = now.format(DateTimeFormatter.ofPattern("dd.MM.yy"));
        System.out.println(format);
    }
}