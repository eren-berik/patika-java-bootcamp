import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "W06-P01_Read-Write-File\\src\\file.txt";

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

        try {
            // Create a FileReader object to read from the file
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader object to read text from a character-input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Declare variables to store data
            String line; // to store each line read from the file
            int currNum, sum = 0; // to store the current number read and the sum of numbers

            // Read each line from the file until the end of the file is reached
            while ((line = bufferedReader.readLine()) != null) {
                // Parse the current line into an integer
                currNum = Integer.parseInt(line);

                // Add the current number to the sum
                sum += currNum;
            }

            // Print the sum of numbers read from the file
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            // Throw a runtime exception if the specified file is not found
            throw new RuntimeException(e);
        } catch (IOException e) {
            // Throw a runtime exception if an I/O error occurs while reading from the file
            throw new RuntimeException(e);
        }
    }
}