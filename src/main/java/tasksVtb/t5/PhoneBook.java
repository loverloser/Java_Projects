package tasksVtb.t5;

import java.util.*;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phones;

    public PhoneBook() {
        phones = new HashMap<>();
    }


    public void add(String name, String phone){
        if(!phones.containsKey(name)){
            phones.put(name, new HashSet<>());
        }
        phones.get(name).add(phone);
    }

    public Set<String> get(String name){
        return phones.get(name);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phones=" + phones +
                '}';
    }


}
