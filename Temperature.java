package DailyDose;
import java.util.Scanner;
public class Temperature 
{
	public static void main(String[] args) 
	{
		int m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius : ");
		m = in.nextInt();
	    double fahrenheit = ((m * 9.0) / 5) + 32;
	    System.out.printf("The temperature in fahrenheit is : " +fahrenheit);
	    in.close();
	}
}