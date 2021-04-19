package Hw.Files.t3;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Java projects\\src\\main\\java\\Hw\\Files\\t3\\names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] arr = new char[128];
            int a = reader.read(arr);
            StringBuilder sb = new StringBuilder();
            while (a > 0) {
                sb.append(new String(arr, 0, a));
                a = reader.read(arr);
            }
            String line = sb.toString();
            String[] result = line.split(" ");
            Stream.of(result)
                    .filter(s -> s.startsWith("A"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
