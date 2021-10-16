package geekbrains.java2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneDirectory {
    private HashMap<String, HashSet<String>> phoneCollection = new HashMap<>(); // Name : Set{Number}
    public void add(String name , String phoneNumber){
        HashSet<String> phones = phoneCollection.computeIfAbsent(name,(key) -> new HashSet<>());
        phones.add(phoneNumber);
    }
    public Collection<String> getNumbers(String name){
        return phoneCollection.get(name);
    }
}
