package DailyDose;
public class MergeTwoStrings 
{
	public static void main(String[] args) 
	{
		 String word1 = "abcd";
	     String word2 = "efgh";
	     String merged = mergeAlternately(word1, word2);
	     System.out.println("Merged String: " + merged);
	}
	public static String mergeAlternately(String word1, String word2) 
	{
		StringBuilder result = new StringBuilder();
	    int length1 = word1.length();
	    int length2 = word2.length();
	    int maxLength = Math.max(length1, length2);

	    // Loop through both strings up to the length of the longer string
	    for (int i = 0; i < maxLength; i++) 
	    {
	    	// Append characters from word1 if i is within its length
	        if (i < length1) 
	        {
	        	result.append(word1.charAt(i));
	        }
	        // Append characters from word2 if i is within its length
	        if (i < length2) 
	        {
	        	result.append(word2.charAt(i));
	        }
	    }
	    return result.toString();
	}
}
