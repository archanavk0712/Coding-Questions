package DailyDose;
public class PositiveOrNegativeNumber 
{
	public static void main(String[] args) 
	{
		int number = 80;

        // Check if the number is positive, negative, or zero
        if (number > 0) 
        {
            System.out.println(number + " is positive.");
        } 
        else if (number < 0) 
        {
            System.out.println(number + " is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
	}
}