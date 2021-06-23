package com.labanovich.dmdev.DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 */
public class Task3 {
    public static void main(String[] args) {
        String formatted = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime now =  LocalDateTime.parse(formatted, dateTimeFormatter);
        System.out.println(now);
    }
}
