package createwritefile;

import java.io.FileWriter;

public class FileWriterOutput {
    public static void main(String[] args) {

        // create a multiline string using + operator
        // the string is a java program
        String program = "class JavaFile { " +
                            "public static void main(String[] args) {  " +
                                "System.out.println(\"This is a file\");" +
                            "}" +
                        "}";

        try {

            // creates a writer using FileWriter
            FileWriter output = new FileWriter("javafile.txt");

            // writes the program to file
            output.write(program);
            System.out.println("Data is written to the file");

            // close the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
