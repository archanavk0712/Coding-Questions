package DailyDose;
import java.util.Scanner;
public class LogicalOperators 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is divisible by both 5 and 3
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
        
        scanner.close();
	}

}
