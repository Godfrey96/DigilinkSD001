import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {

        // Create a list of numbers using arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

        //  adding numbers
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // retrieving an element from the list using index
        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nIteration #2: ");
        for (Integer value: numbers) {
            System.out.println(value);
        }

        // removing last item from the list
        numbers.remove(numbers.size() - 1);

        // remove first item from the list
        numbers.remove(0);

        System.out.println("\nIteration 3: ");
        for (Integer value: numbers) {
            System.out.println(value);
        }
    }
}
