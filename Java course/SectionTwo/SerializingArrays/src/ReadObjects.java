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
        try (FileInputStream fis = new FileInputStream("people.txt"); ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person[] people = (Person[]) ois.readObject();

            ArrayList<Person> peopleList = (ArrayList<Person>) ois.readObject();

            for (Person person : people) {
                System.out.println(person);
            }

            for (Person person : peopleList) {
                System.out.println(person);
            }

            int num = ois.readInt();

            for (int i = 0; i < num; i++) {
                Person person = (Person) ois.readObject();
                System.out.println(person);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
