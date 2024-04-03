import java.io.*;
import java.util.Scanner;

public class Main {
    // Scanner object for user input
    static Scanner sc = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        // Define the file path
        String filePath = "file.txt";

        // Read and display the content of the file
        readFileContent(filePath);

        // Write content to the file
        writeFileContent(filePath);

        // Close the scanner
        sc.close();
    }

    // Method to write content to the file
    public static void writeFileContent(String filePath) {
        // Declare variable to store user input text
        String text;

        // Create a File object with the specified file path
        File file = new File(filePath);

        // Check if the file does not exist
        if (!file.exists()) {
            try {
                // Create a new file if it doesn't exist
                file.createNewFile();
            } catch (IOException e) {
                // Throw a runtime exception if an I/O error occurs while creating the file
                throw new RuntimeException(e);
            }
        }

        // Prompt the user to enter text
        System.out.print("Please enter the text: ");
        text = sc.nextLine();

        FileWriter fileWriter = null;
        try {
            // Open FileWriter in append mode to append text to the file
            fileWriter = new FileWriter(filePath, true);
        } catch (IOException e) {
            // Throw a runtime exception if an I/O error occurs while creating the FileWriter
            throw new RuntimeException(e);
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Write the text entered by the user to the file followed by a newline
        printWriter.println(text);

        // Close the PrintWriter
        printWriter.close();
    }

    // Method to read content from the file
    public static void readFileContent(String filePath) {
        FileReader fileReader;
        try {
            // Create a FileReader object to read from the file
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            // Throw a runtime exception if the specified file is not found
            throw new RuntimeException(e);
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileContent;
        try {
            // Read the first line from the file
            fileContent = bufferedReader.readLine();

            // Loop until there are no more lines to read
            while (fileContent != null) {
                // Print the current line
                System.out.println(fileContent);

                // Read the next line
                fileContent = bufferedReader.readLine();
            }
        } catch (IOException e) {
            // Throw a runtime exception if an I/O error occurs while reading from the file
            throw new RuntimeException(e);
        } finally {
            // Close the BufferedReader
            try {
                bufferedReader.close();
            } catch (IOException e) {
                // Handle or throw exception if closing fails
                e.printStackTrace();
            }
        }
    }
}
