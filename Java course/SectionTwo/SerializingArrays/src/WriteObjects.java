import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


// a java program for serialization of a Person object
// this program is converting the state of an object into a byte-stream
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        // creating an array of people and initialize them
        Person[] people = {
                new Person(5, "Sue"),
                new Person(54, "Bob"),
                new Person(23, "Mike")
        };

        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

        // using the try_with_resource to create and writing the object
        try(FileOutputStream fos = new FileOutputStream("people.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(people);

            oos.writeObject(peopleList);

            oos.writeInt(peopleList.size());

            for (Person person: peopleList) {
                oos.writeObject(person);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
