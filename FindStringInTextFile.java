package DailyDoseDay2;
import java.io.*;

public class FindStringInTextFile
{
    public static void main(String[] args) 
    {
        // Specify the file path and the string to search for
        String filePath = "example.txt";
        String searchString = "hello";

        // Call the method to search for the string
        boolean found = searchInFile(filePath, searchString);

        if (found) {
            System.out.println("String found in the file!");
        } else {
            System.out.println("String not found in the file.");
        }
    }

    // Method to search for a string in a text file
    public static boolean searchInFile(String filePath, String searchString) {
        // Try-with-resources to automatically close the file after reading
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // If the search string is found in the current line, return true
                if (line.contains(searchString)) {
                    return true;
                }
            }
        } catch (IOException e) {
            // Handle the exception if the file cannot be read
            System.out.println("Error reading the file: " + e.getMessage());
        }
        // Return false if the string is not found
        return false;
    }
}