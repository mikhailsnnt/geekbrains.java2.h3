package geekbrains.java2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        task1Demo();
        System.out.println("\n\n");
        task2Demo();

    }
    private static void task1Demo(){
        String[] words = new String[]{
                "Hello","Some","Some","world","other","other","world","Hi!","hashmap","hashmap","hashmap",
                "java.util","java.util","java.util"
        };
        HashMap<String , Integer> map = new HashMap<>();
        for (String word :
                words) {
            map.put(word, map.getOrDefault(word,0) + 1);
        }
        System.out.println("Unique words: ");
        for (String word :
                map.keySet()){
            System.out.println(word);
        }
        System.out.println("Words count:");
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    private static void task2Demo(){
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Vasya","+793");
        phoneDirectory.add("Vasya","+794");
        Collection<String> numbers = phoneDirectory.getNumbers("Vasya");
        if(numbers == null)
            System.out.println("Vasya not in phone book!");
        else{
            System.out.println("Vasya numbers: ");
            for (String number :
                    numbers) {
                System.out.println(number);
            }
        }
        numbers = phoneDirectory.getNumbers("Petya");
        if(numbers == null)
            System.out.println("Petya not in phone book!");
        else{
            System.out.println("Petya numbers: ");
            for (String number :
                    numbers) {
                System.out.println(number);
            }
        }
    }
}
