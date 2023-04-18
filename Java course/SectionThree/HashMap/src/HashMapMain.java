import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        Map<Integer, String> languages = new HashMap<>();

        languageMethod(languages);

        // add items to map
//        map.put(5, "Five");
//        map.put(3, "Three");
//        map.put(6, "Six");
//        map.put(8, "Eight");
//        map.put(4, "Four");

        // get item from map using the get() method
//        String text = map.get(3);
//        System.out.println(text);
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            int key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " " + value);
//        }
    }

    public static void languageMethod(Map<Integer, String> languages){

        // using the put() to add elements
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C");
        languages.put(4, "C++");
        languages.put(5, "C#");
        System.out.println("HashMap: " + languages + "\n");

        // using the get() to get element
        String getStr = languages.get(2);
        System.out.println("Value at index 2: " +  getStr + "\n");

        // using keySet() method to return set view of keys
        System.out.println("Keys: " + languages.keySet() + "\n");

        // using values() to return set view of values
        System.out.println("Values: " + languages.values() + "\n");

        // using entrySet() to return set view of key/value pairs
        System.out.println("Key/Value: " + languages.entrySet() + "\n");

        // using replace() method to change an element
        languages.replace(3, "JavaScript");
        System.out.println("Updated HashMap: " + languages + "\n");

        // using remove to remove an element
        String removeStr = languages.remove(4);
        System.out.println("Removed element: " + removeStr);
        System.out.println("Updated HashMap after removing an element: " + languages + "\n");

        // Iterate through a hashmap
        // iterate through keys only
        System.out.print("\nKeys only: ");
        for (Integer key: languages.keySet()){
            System.out.print(key);
            System.out.print(", ");
        }
        // iterate through values only
        System.out.print("\nValues only: ");
        for (String value: languages.values()){
            System.out.print(value);
            System.out.print(", ");
        }

        // iterate through key/value pair
        System.out.print("\nEntries: ");
        for (Map.Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        System.out.println("\nEntries: ");
        for (Map.Entry<Integer, String> entry : languages.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}
