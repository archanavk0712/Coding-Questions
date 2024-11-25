package DailyDoseDay2;

public class PalindromeString 
{
    public static void main(String[] args) 
    {
        // Example input string
        String str = "racecar";

        // Check if the string is a palindrome
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string into a StringBuilder to easily reverse it
        StringBuilder reversedStr = new StringBuilder(str);
        
        // Reverse the string
        reversedStr.reverse();

        // Compare the original string with the reversed string
        return str.equals(reversedStr.toString());
    }
}

