package DailyDoseDay3;
import java.util.Scanner;
public class DollarsToRupees 
{
    public static void main(String[] args) 
    {
        // Fixed conversion rate (this can change over time)
        double exchangeRate = 83.0; // 1 USD = 83 INR

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Amount in dollars
        System.out.print("Enter amount in Dollars: ");
        double dollars = scanner.nextDouble();

        // Convert dollars to rupees
        double rupees = dollars * exchangeRate;

        // Output the result
        System.out.println(dollars + " Dollars is equal to " + rupees + " Indian Rupees.");

        // Close the scanner
        scanner.close();
    }
}
