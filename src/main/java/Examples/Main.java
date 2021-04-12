package Examples;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


    }

    public int stringTest() {
        Map<Character, Integer> res = new HashMap<>();
        fillTheMap(res);
        String line = "eeegggaaaahhfffaaa";
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
    public static void fillTheMap(Map<Character, Integer> res){
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
