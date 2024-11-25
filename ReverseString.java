package DailyDoseDay2;
import java.util.Scanner;
public class ReverseString 
{
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string using a StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
