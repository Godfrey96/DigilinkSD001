import java.io.FileReader;

public class FileReaderExample2 {
    public static void main(String[] args) {
        // creates an array of character
        char[] array = new char[100];

        try {
            // creates a reader using the FileReader
            FileReader input = new FileReader("input.txt");

            // reads characters
            input.read(array);
//            System.out.println("Data in the file: ");
            System.out.println(array);

            // close the reader
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
