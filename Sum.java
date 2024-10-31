package DailyDose;
import java.util.Scanner;
public class Sum 
{
	public static void main(String[] args) 
	{
		int m,n,k;
		Scanner in = new Scanner(System.in);        
		System.out.print("Enter the first number : ");
		m = in.nextInt();
		System.out.print("Enter the second number : ");
		n = in.nextInt();
		System.out.print("Enter the third number : ");
        k = in.nextInt();
        int sum1 = m + n;
        int sum2 = m + k;
        int sum3 = n + k;
		System.out.println("The sum of "+m+" and "+n+" is "+sum1);
		System.out.println("The sum of "+m+" and "+k+" is "+sum2);
        System.out.println("The sum of "+n+" and "+k+" is "+sum3);
        in.close();
	}
}