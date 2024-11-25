package DailyDoseDay3;
import java.util.List;
public class CheckListContainsOddNumbers 
{
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);

        // Check if the list contains only odd numbers
        if (containsOnlyOddNumbers(numbers)) {
            System.out.println("The list contains only odd numbers.");
        } else {
            System.out.println("The list contains even numbers.");
        }
    }

    // Method to check if the list contains only odd numbers
    public static boolean containsOnlyOddNumbers(List<Integer> numbers) {
        // Iterate through the list and check if each number is odd
        for (int num : numbers) {
            if (num % 2 == 0) {  // If an even number is found
                return false;  // Return false immediately
            }
        }
        return true;  // All numbers are odd
    }
}
