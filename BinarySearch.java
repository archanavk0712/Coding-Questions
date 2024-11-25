package DailyDoseDay2;

public class BinarySearch 
{
    public static int binarySearch(int[] arr, int target) {
        // Define the low and high pointers for the search range
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Find the middle index
            int mid = low + (high - low) / 2;

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid;  // Target found, return the index
            }

            // If target is smaller, ignore the right half
            if (arr[mid] > target) {
                high = mid - 1;
            } 
            // If target is larger, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // If the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {2, 3, 4, 10, 40};
        
        int target = 10;
        int result = binarySearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}