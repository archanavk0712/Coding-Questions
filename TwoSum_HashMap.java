package DailyDoseDay2;
import java.util.HashMap;
public class TwoSum_HashMap 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        // Create a hash map to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement of the current number
            
            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            // Otherwise, store the current number with its index in the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution found (though it's guaranteed there is one solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        // Test examples
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]"); // Output: [0, 1]
    }
}
