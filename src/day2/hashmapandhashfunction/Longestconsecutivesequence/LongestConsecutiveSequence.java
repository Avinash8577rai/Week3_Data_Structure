package day2.hashmapandhashfunction.Longestconsecutivesequence;
import java.util.*;
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for (int num: nums){
            set.add(num);

        }
        int longest = 0;

        // Step 2: Iterate through each number in the HashSet
        for (int num : set) {
            // Step 3: Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Step 4: Count the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Step 5: Update the longest streak
                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }

}
