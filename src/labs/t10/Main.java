package labs.t10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //firstTask();
        //secondTask();
        thirdTask();
    }

    private static void firstTask() {
        double result = 0;
        int countOfLines = 0;
        try {
            File file = new File("C:\\Java projects\\src\\labs\\t10\\test1.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] lines = line.split(" ");
                //marks is third elements in "lines"
                result += Integer.parseInt(lines[2]);
                if (Integer.parseInt(lines[2]) < 3) {
                    System.out.println("mark less than 3 " + line);
                }
                countOfLines++;
            }

            System.out.println("avg mark is " + (result / countOfLines));
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void secondTask() {
        try {
            double avg;
            double sum = 0;
            int result = 0;
            File file = new File("C:\\Java projects\\src\\labs\\t10\\test2.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] strArr = sc.nextLine().split(" ");
                for (String value : strArr) {
                    sum += Integer.parseInt(value);
                }
                avg = sum / strArr.length;
                for (String s : strArr) {
                    if (Integer.parseInt(s) < avg) {
                        result++;
                    }
                }
            }

            System.out.println(result);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void thirdTask() {
        try {
            List<Character> abc = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'));
            File file = new File("C:\\Java projects\\src\\labs\\t10\\qwer.txt");
            FileWriter fw = new FileWriter(file);
            Random random = new Random();
            for (int i = 0; i < 1024; i++) {
                fw.write(abc.get(random.nextInt(8)) + " ");
            }
            Map<Character, Integer> res = new HashMap<>();
//
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                int value = 0;
//                char[] charArr = line.toCharArray();
//                for (int i = 0; i < charArr.length - 1; i++) {
//                    if (abc.contains(charArr[i]) && charArr[i] == charArr[i + 1]) {
//                        value++;
//                        res.put(charArr[i], value);
//                    } else value = 1;
//                }
//            }
//            int result = 0;
//            for (Map.Entry<Character, Integer> entry : res.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
//            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
