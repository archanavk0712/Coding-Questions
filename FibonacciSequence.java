package DailyDoseDay3;
import java.util.Scanner;
public class FibonacciSequence 
{
    public static void main(String[] args) 
    {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for number of terms
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Calling the method to print Fibonacci sequence
        printFibonacci(n);

        // Close the scanner
        scanner.close();
    }

    // Method to print Fibonacci sequence up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        
        // Print the first two terms of the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        
        // Loop to generate and print Fibonacci numbers up to n terms
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(first + " ");
            } else if (i == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}
