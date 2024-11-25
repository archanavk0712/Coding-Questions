package DailyDoseDay2;
import java.util.Arrays;
public class CheckTwoArrayHasSameElemets 
{
    public static void main(String[] args) 
    {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        if (areArraysEqual(array1, array2)) {
            System.out.println("The arrays contain the same elements.");
        } else {
            System.out.println("The arrays do not contain the same elements.");
        }
    }

    // Method to check if two arrays contain the same elements
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays element by element
        return Arrays.equals(array1, array2);
    }
}