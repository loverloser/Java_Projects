package Hw.Files.t1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder1/folder2/folder3");
        File file1 = new File("folder1/folder2/folder3/Aest1.txt");
        File file2 = new File("folder1/folder2/folder3/Aest2.txt");
        File file3 = new File("folder1/folder2/folder3/test3.txt");

        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File[] files = directory.listFiles((dir, name) -> name.startsWith("A"));

        assert files != null;
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
