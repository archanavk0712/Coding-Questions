package DailyDoseDay2;
import java.util.Scanner;

public class CalculateSimpleInterest 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for Principal (P)
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input for Rate of interest (R)
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Input for Time period (T)
        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
