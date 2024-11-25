package DailyDoseDay3;
import java.util.Scanner;
public class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Decimal number to convert
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to binary
        String binaryNumber = convertToBinary(decimalNumber);

        // Output the binary number
        System.out.println("Binary representation: " + binaryNumber);

        // Close the scanner
        scanner.close();
    }

    // Method to manually convert decimal to binary
    public static String convertToBinary(int decimal) {
        // If the decimal number is zero, return "0"
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        
        // Repeatedly divide by 2 and collect remainders
        while (decimal > 0) {
            binary.insert(0, decimal % 2);  // Insert remainder at the front
            decimal = decimal / 2;
        }
        
        return binary.toString();
    }
}
