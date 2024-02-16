import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {
        // File path
        String filePath = "example.txt";

        // Create and write to a file
        writeFile(filePath, "Hello, this is a file handling example.");

        // Read from the file
        String content = readFile(filePath);
        System.out.println("Content of the file: " + content);
    }

    // Method to create and write to a file
    private static void writeFile(String filePath, String content) {
        try {
            // Create a FileWriter with the given file path
            FileWriter writer = new FileWriter(filePath);

            // Write the content to the file
            writer.write(content);

            // Close the FileWriter
            writer.close();

            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Method to read from a file
    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try {
            // Create a FileReader with the given file path
            FileReader reader = new FileReader(filePath);

            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Read the content line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Close the BufferedReader
            bufferedReader.close();

            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }

        return content.toString();
    }
}
