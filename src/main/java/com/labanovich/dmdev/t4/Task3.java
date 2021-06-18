package com.labanovich.dmdev.t4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Написать метод isUnique, который принимает Map&lt;String, String&gt;
 * и возвращает true,
 * если каждому ключу соответствуют свое уникальное значение.
 * Например, в данном случае вернётся true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 * Hal=Perkins} 
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("Marty","Stepp");
        map.put("Stuart","Reges");
        map.put("Jessica","Miller");
        map.put("Amanda","Camp");
        map.put("Hal","Perkins");
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
