package DailyDose;
import java.util.Scanner;
public class SumOfNaturalNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
	    // Read the number of test cases
		System.out.print("Enter the number of test cases: ");
	    int testCases = scanner.nextInt();
	    
	    // Loop through each test case
	    for (int i = 0; i < testCases; i++) 
	    {
	     // Read the value of n
	    	System.out.print("Enter a number: ");
	         int n = scanner.nextInt();
	         
	         // Calculate the sum of the first n natural numbers
             int sum = 0;
             for (int j = 1; j <= n; j++) 
             {
            	 sum += j;
             }
             
	         // Print the result for the current test case
	         System.out.println(sum);
	     }

	    scanner.close();
	    }
	}