package exercises.echo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    // Example of the FileInputStream
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("resources/samples/sample.txt")) {
            System.out.println("Data in the file: ");

            // Skips the 5 bytes
            long skipped = input.skip(5);
            System.out.println("Input stream after skipping 5 bytes: " + skipped);


            // Reads the first byte
            int i = input.read();
            // Reads the entire file until no byte is read
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
