package geekbrains.java2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Task 1:
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
        //Task 2:

    }
}
