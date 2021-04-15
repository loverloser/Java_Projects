package Hw.StreamIpi.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }
        List<String> result = numbers.stream()
                .filter((integer) -> integer % 2 == 0 && integer % 5 == 0)
                .map(Math::sqrt)
                .map((sqrt) -> "sqrt " + sqrt)
                .collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
