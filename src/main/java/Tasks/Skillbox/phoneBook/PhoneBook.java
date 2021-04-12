package Tasks.Skillbox.phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String,Long> phoneBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Введите имя или телефон");
            if(scanner.hasNextLong()){
                long number = scanner.nextLong();
                if(phoneBook.containsValue(number)){
                    for(Map.Entry<String, Long> entry : phoneBook.entrySet()){
                        if(entry.getValue().equals(number)){
                            System.out.println(entry.getValue() + "-->" + number);
                        }

                    }
                }else{
                    System.out.println("Введите имя");
                    String name = scanner.nextLine();
                    phoneBook.put(name, number);
                }

            }else{
                String command = scanner.nextLine();

                if (command.equals("LIST")){
                    printMap(phoneBook);
                } else {

                    if(phoneBook.containsKey(command)){
                        System.out.println(phoneBook.get(command));
                    }else{
                        System.out.println("Введите телефон");
                        long phone = scanner.nextLong();
                        phoneBook.put(command, phone);
                    }

                }
            }

        }
    }

    public static void printMap(Map<String, Long> map){
        Map<String, Long> list = new TreeMap<>(map);
        for(String key : list.keySet()){
            System.out.println(key + "-->" + map.get(key));
        }
    }

}
