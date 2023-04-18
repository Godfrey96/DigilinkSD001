import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsMain {

    public static void main(String[] args) {

        // hashset does not retain order
//        Set<String> set1 = new HashSet<String>();

        //LinkedHashSet remembers the order you added
//        Set<String> set1 = new LinkedHashSet<>();

        // TreeSet sorts in natural order
        Set<String> set1 = new TreeSet<>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        // adding items to set
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start - (no!)");
        }

        // adding duplicate items does nothing
        set1.add("mouse");

        System.out.println(set1);

        // Iteration
        for (String element: set1) {
            System.out.println(element);
        }

        // Does not contains a give item
        if (set1.contains("aardvark")) {
            System.out.println("Contains aardvark");
        }

        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }

        //intersection
        // set2 contains some common elements with set1, and some new
        Set<String> set2 = new TreeSet<>();

        // adding items to set
        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("lion");
        set2.add("monkey");

        Set<String> intersection = new HashSet<String>(set1);

        System.out.println(intersection);

        intersection.retainAll(set2);

        System.out.println(intersection);

        // difference
        Set<String> difference = new HashSet<String>(set2);
        difference.retainAll(set1);
        System.out.println(difference);
     }
}
