package exercises.echo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    // Example of OutputStream
    public static void main(String[] args) {
        String data = "This line of text goes for the file";

        try (OutputStream output = new FileOutputStream("resources/samples/outputstream.txt")) {

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            output.write(dataBytes);
            output.write("\nA new line inside the text file.".getBytes());
            output.write("\nYou need to add '\\n' manually, otherwise".getBytes());
            output.write("\nyour text won't break any line".getBytes());
            output.write("\nand print everything in just one line".getBytes());
            output.flush();
            System.out.println("Data is written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
