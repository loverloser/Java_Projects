package Tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Character> abc = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'));
//        Map<Character, Integer> res = new HashMap<>();
//        String str = "aaabbbbbbbbbbcdeffgh";
//        char[] arr = str.toCharArray();
//        int value = 1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (abc.contains(arr[i]) && arr[i] == arr[i + 1]) {
//                value++;
//                res.put(arr[i], value);
//            } else value = 1;
//        }
//        for (Map.Entry<Character, Integer> entry : res.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        try {
            List<Character> abc = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'));
            File file = new File("C:\\Java projects\\src\\labs\\t10\\test3.txt");
            FileWriter fw = new FileWriter(file);
            Random random = new Random();
            for (int i = 0; i < 1024; i++) {
                fw.write(abc.get(random.nextInt(8)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}