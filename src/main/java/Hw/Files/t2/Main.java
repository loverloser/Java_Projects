package Hw.Files.t2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folderr");
        File file = new File(directory.getName() + "/test.txt");
        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while(a != -1){
                System.out.print((char) a);
                a = inputStream.read();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
