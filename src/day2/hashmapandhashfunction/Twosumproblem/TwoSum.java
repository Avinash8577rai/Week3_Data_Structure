package day2.hashmapandhashfunction.Twosumproblem;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Calculate the complement

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the indices of the complement and the current element
                return new int[]{map.get(complement), i};
            }

            // If not, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[]{};
}
