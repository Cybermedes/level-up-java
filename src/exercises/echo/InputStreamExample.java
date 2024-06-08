package exercises.echo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

    // Example of the InputStream
    public static void main(String[] args) {

        byte[] kilobyte = new byte[1024];

        try (InputStream input = new FileInputStream("resources/samples/sample.txt")) {
            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            int read = input.read(kilobyte);
            System.out.println("Number of bytes read: " + read);
            System.out.println("Data read from the file: ");

            // Read the remaining bytes
            byte[] remainingBytes = input.readAllBytes();

            // Convert byte array into string
            String data = new String(kilobyte);
            System.out.println(data);

            System.out.println();
            System.out.println(">>> The remaining of the file:");
            System.out.println(new String(remainingBytes));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
