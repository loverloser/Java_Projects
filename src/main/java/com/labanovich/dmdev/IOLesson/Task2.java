package com.labanovich.dmdev.IOLesson;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "test.txt");
        try (Scanner sc = new Scanner(path)) {
            String prev = null;
            if(sc.hasNext()){
                prev = sc.next();
            }
            while (sc.hasNext()){
                String present = sc.next();
                if(isTrueD(prev, present)){
                    System.out.println(prev + " " + present);
                }
                prev = present;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static boolean isTrueD(String prev, String present){
        return prev.charAt(prev.length() - 1) == present.charAt(0);
    }
}
