package writeObjects;

import java.io.*;

public class WriterReader {
    public static void main(String[] args) {

        Person p1 = new Person("Mogau", 25, "Male");
        Person p2 = new Person("Charmaine", 27, "Female");

        try {
            FileOutputStream fo = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream oo = new ObjectOutputStream(fo);

            // write objects to file
            oo.writeObject(p1);
            oo.writeObject(p2);

            oo.close();
            fo.close();

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // read objects
            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
