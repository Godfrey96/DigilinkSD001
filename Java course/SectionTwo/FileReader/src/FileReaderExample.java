import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("testout.txt");
        int i;

        while ((i = fr.read()) != -1){
            System.out.println((char)i);
        }
        fr.close();
    }
}
