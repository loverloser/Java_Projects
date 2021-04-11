package labs.t8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> listOfStudents = new HashMap<>();

        listOfStudents.put(1,addStudent("Лобанович Тимофей Витальевич","16","ПО-22"));
        listOfStudents.put(2,addStudent("Иванов Максим Артёмович","22","ПО-21"));
        listOfStudents.put(3,addStudent("Голуб Максим владимирович","17","ПО-22"));
        listOfStudents.put(4,addStudent("Сидоров Никита Васильевич","22","Бб-11111"));

        System.out.println("first task: ");
        plusOneYear(listOfStudents);
        System.out.println("Second task: ");
        printStudentsList(listOfStudents);
    }

    private static List<String> addStudent(String name, String age, String group){
        List<String> student = new ArrayList<>();
        student.add(name);
        student.add(age);
        student.add(group);
        return student;
    }

    private static void plusOneYear(Map<Integer, List<String>> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс студета, у которого повышаем возраст: ");
        int index = sc.nextInt();
        for (Map.Entry<Integer, List<String>> integerListEntry : list.entrySet()) {
            if (integerListEntry.getKey() == index){
                //1 = index age in List
                String temp =  integerListEntry.getValue().get(1);
                integerListEntry.getValue().remove(1);
                int newAge = Integer.parseInt(temp) + 1;
                integerListEntry.getValue().add(1,Integer.toString(newAge));
            }
        }
        System.out.println(list.get(index));
        sc.close();
    }

    private static void printStudentsList(Map<Integer, List<String>> list){
        for (Map.Entry<Integer, List<String>> integerListEntry : list.entrySet()) {
            if(Integer.parseInt(integerListEntry.getValue().get(1)) == 22){
                System.out.println(integerListEntry.getKey() + " " + integerListEntry.getValue().toString());
            }
        }
    }
}
