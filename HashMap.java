import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number -> index mapping
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists 
            if (map.containsKey(complement)) {
                // Found the two numbers — return their indices
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }
        
        // This line will never be reached since the problem guarantees one solution
        throw new IllegalArgumentException("No two sum solution");
    }
}
