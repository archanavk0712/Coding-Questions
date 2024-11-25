package DailyDose;
public class CheckVowelsInString 
{
	public static void main(String[] args) 
	{
		String input = "Archana";

        // Check if the string contains any vowels
        if (containsVowel(input))
        {
            System.out.println("The string contains a vowel.");
        } 
        else 
        {
            System.out.println("The string does not contain any vowels.");
        }
    }

    // Method to check if a string contains any vowels
    public static boolean containsVowel(String input) {
        // Convert string to lowercase for easy comparison
        input = input.toLowerCase();

        // Check if any vowel is present in the string
        for (char c : input.toCharArray())
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
            {
                return true;
            }
        }

        return false; // No vowel found
    }
}
	
