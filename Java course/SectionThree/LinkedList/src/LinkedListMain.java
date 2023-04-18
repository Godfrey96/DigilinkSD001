import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        // Array List of integers that are in the list of integers
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Linked List of integers that are in the list of integers
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<String> animalList = new LinkedList<String>();

        // call the animals method
        animals(animalList);

        //doTimings("ArrayList", arrayList);
        //doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {
        // add items in the list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        // start time
        long start = System.currentTimeMillis();

        // Add items at end of list
        for (int i = 0; i < 1E5; i++){
            list.add(list.size(), i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }

    public static void animals(List<String> list){
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");

        System.out.println("LinkedList: " + list);

        // add() method with the index
        list.add(1, "Horse");
        System.out.println("Updated LinkedList: " + list);

        // using the get() method to access an element from the LinkedList
        String str = list.get(1);
        System.out.println("Element at index " + list.indexOf(str) + " is " + str + "\n");

        // using the set() to change element in a list
        String setStr = list.set(2, "Sheep");
        System.out.println("Updated element: " + setStr);
        System.out.println("Updated List after set() method: " + list + "\n");

        // using the remove() method to remove an element in a list
        String removeStr = list.remove(1);
        System.out.println("Removed element: " + removeStr);
        System.out.println("Updated List after remove() method: " + list);
    }

}
