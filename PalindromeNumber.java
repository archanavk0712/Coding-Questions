package DailyDose;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num = 12321; 
        int reversedNum = 0, remainder, originalNum;

        originalNum = num;

        // Reverse the number
        while (num != 0) 
        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // Check if the original number is equal to its reverse
        if (originalNum == reversedNum) 
        {
            System.out.println(originalNum + " is a palindrome.");
        } 
        else 
        {
            System.out.println(originalNum + " is not a palindrome.");
        }
	}
}
