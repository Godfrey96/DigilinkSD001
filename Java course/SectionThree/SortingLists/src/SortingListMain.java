import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        int len1 = o1.length();
        int len2 = o2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class SortingListMain {

    public static void main(String[] args) {

        // SORTING STRINGS
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");

        //Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new ReverseAlphabeticalComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        // SORTING NUMBERS
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(75);
        numbers.add(40);
        numbers.add(9);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for (Integer number: numbers){
            System.out.println(number);
        }

        // SORTING ARBITARY OBJECTS
        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Sue"));
        people.add(new Person(2, "Clare"));

        System.out.println("\n");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person: people){
            System.out.println(person);
        }
    }
}
