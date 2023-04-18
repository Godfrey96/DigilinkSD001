import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SotedMapMain {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap =new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(5, "fox");
        map.put(3, "cat");
        map.put(1, "dog");
        map.put(15, "giraffe");
        map.put(2, "swan");
        map.put(8, "bear");
        map.put(7, "snake");

        for (Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
