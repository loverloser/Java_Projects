package com.labanovich.dmdev.DateAndTime;

import java.time.LocalDateTime;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней. 
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2017, 6, 25, 19, 47 );
        LocalDateTime localDateTime1 = localDateTime.plusMonths(3L);
        System.out.println(localDateTime1);
    }
}
