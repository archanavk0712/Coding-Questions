package DailyDose;

public class SwapNumbers 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;

		a = a + b; // a now becomes 15
		b = a - b; // b becomes 5 (original value of a)
		a = a - b; // a becomes 10 (original value of b)

		System.out.println("a = " + a + ", b = " + b);
	}

}
