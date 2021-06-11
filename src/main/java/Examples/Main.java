package Examples;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> surNames = new ArrayList<>();
        surNames.add("Jason");
        surNames.add("Tim");
        surNames.add("Danik");
        surNames.add("Jack");
        surNames.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
    }

}
