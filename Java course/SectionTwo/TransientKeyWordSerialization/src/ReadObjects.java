import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// a java program for deserialization of a Person object
// this program is converting the byte-stream into an object
public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        // using the try_with_resource to read the file from byte-stream to object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"))) {

            Person person = (Person) ois.readObject();
            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
