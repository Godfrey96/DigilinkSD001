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

        // using the try_with_resource to create and writing the object
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"))){

            Person person = new Person(7, "Bob");
            Person.setCount(88);
            oos.writeObject(person);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
