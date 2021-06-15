package com.labanovich.IPOlabs.t10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        firstTask();
        System.out.println(main.secondTask());
        try {
            System.out.println(main.thirdTask());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void firstTask() {
        double result = 0;
        int countOfLines = 0;
        Scanner sc = null;
        try {
            File file = new File("C:\\Java projects\\src\\main\\java\\labs\\t10\\test1.txt");
            sc = new Scanner(file);
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
        } finally {
            assert sc != null;
            sc.close();
        }

    }

    public int secondTask() {
        Scanner sc = null;
        try {
            double avg;
            double sum = 0;
            int result = 0;
            File file = new File("C:\\Java projects\\src\\main\\java\\labs\\t10\\test2.txt");
            sc = new Scanner(file);
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

            return result;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert sc != null;
            sc.close();
        }
        return 0;
    }

    public int thirdTask() throws IOException {
        try {
            Map<Character, Integer> res = new HashMap<>();
            fillTheMap(res);
            List<Character> abc = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'));
            File file = new File("C:\\Java projects\\src\\main\\java\\labs\\t10\\test3.txt");

            FileWriter fw = new FileWriter(file);
            //random for abc which will be in file test3.txt
            Random random = new Random();
            for (int i = 0; i < 1024; i++) {
                fw.write(abc.get(random.nextInt(abc.size() - 1)));
            }
            fw.close();

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                int value = 1;
                char[] charArr = line.toCharArray();
                for (int i = 0; i < charArr.length - 1; i++) {
                    if (charArr[i] == charArr[i + 1]) {
                        value++;
                        if (res.get(charArr[i]) <= value) {
                            res.put(charArr[i], value);
                        }
                    } else {
                        value = 1;
                    }
                }

                int result = 0;
                for (Map.Entry<Character, Integer> entry : res.entrySet()) {
                    if (entry.getValue() >= result) {
                        result = entry.getValue();
                    }
                }
                return result;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void fillTheMap(Map<Character, Integer> res) {
        res.put('a', 0);
        res.put('b', 0);
        res.put('c', 0);
        res.put('d', 0);
        res.put('e', 0);
        res.put('f', 0);
        res.put('g', 0);
        res.put('h', 0);
    }
}
