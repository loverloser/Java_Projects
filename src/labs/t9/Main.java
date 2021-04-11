package labs.t9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        firstTask(1,2,3,4);
        System.out.println(secondTask("абвгд вфыв пар р ошгш гш нз щш"));
    }

    private static void firstTask(int a, int b, int a1, int b1){
        double firstG = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        double secondG = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1,2));
        if(firstG > secondG){
            System.out.println("Гиппотенуза 1 - больше");
        } else if(firstG < secondG){
            System.out.println("Гиппотенуза 2 - больше");
        } else {
            System.out.println("Гиппотенузы равны");
        }
    }

    private static String secondTask(String str){
        String[] arr = str.split(" ");
        List<String> strings = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(strings);
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string).append(" ");
        }
        return result.toString();
    }
}
