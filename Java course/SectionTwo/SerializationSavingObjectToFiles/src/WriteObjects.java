import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


// a java program for serialization of a Person object
// this program is converting the state of an object into a byte-stream
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        // creating and initializing the objects
        Person mike = new Person(445, "Mike");
        Person sue = new Person(215, "Sue");

        System.out.println(mike);
        System.out.println(sue);

        // using the try_with_resource to create and writing the object
        try(FileOutputStream fos = new FileOutputStream("people.txt")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(mike);
            oos.writeObject(sue);

            // closing the stream
            oos.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
