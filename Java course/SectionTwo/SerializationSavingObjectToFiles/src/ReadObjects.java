import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// a java program for deserialization of a Person object
// this program is converting the byte-stream into an object
public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        // using the try_with_resource to read the file from byte-stream to object
        try(FileInputStream fis = new FileInputStream("people.txt")){

            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            // closing the stream
            ois.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
