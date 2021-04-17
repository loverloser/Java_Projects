package labs.t7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }


    private static void firstTask() {
        List<String> months = new ArrayList<>();
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        months.add("January");
        months.add("February");
        months.add("March");
        List<String> newMonthsList = new ArrayList<>(months.subList(0, 3));
        System.out.println(newMonthsList);
    }

    private static void secondTask() {
        Map<String, Integer> userPasswords = new HashMap<>();
        userPasswords.put("wqer", 2134565);
        userPasswords.put("yrg", 7678);
        userPasswords.put("wgdfgdfhqer", 1488);
        userPasswords.put("wqesdfsdfr", 5);
        userPasswords.put("wqvcbcer", 778909);
        userPasswords.put("wq,kuer", 420);
        userPasswords.put("wqtryyuer", 154545);

        for (Map.Entry<String, Integer> entry : userPasswords.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
