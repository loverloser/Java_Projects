package com.labanovich.dmdev.IOLesson;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "test.txt");
        String abc = "аюиуеоэя";
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNext()) {
                String res = sc.next();
                if (abc.indexOf(res.charAt(0)) != -1) {
                    System.out.println(res);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
