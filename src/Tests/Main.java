package Tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java projects\\src\\Tests\\qwer.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(1234);
        fw.close();
    }
}
