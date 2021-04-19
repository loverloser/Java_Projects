package Hw.Files.t4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Java projects\\src\\main\\java\\Hw\\Files\\t4\\test.txt");
        while (true) {
            System.out.println("Input name");
            Scanner sc = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder();
            String name = sc.nextLine();
            if(name.equals("Exit")){
                break;
            }
            String res = stringBuilder.append(name).append(" ").toString();
            try(OutputStream  outputStream = new FileOutputStream(file, true))  {
                outputStream.write(res.getBytes());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try(InputStream reader = new BufferedInputStream(new FileInputStream(file))){
            byte[] arr = new byte[128];
            int count = reader.read(arr);
            while (count > 0){
                String result = new String(arr, 0, count);
                System.out.println(result);
                count = reader.read(arr);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
