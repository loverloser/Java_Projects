package Hw.Files.t5;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Java projects\\src\\main\\java\\Hw\\Files\\t5\\text.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or \"stop\" to exit");
            byte[] pageText = new byte[3000];
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek((long) (page - 1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter next page or \"stop\" to exit");
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
