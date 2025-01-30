package day2.hashmapandhashfunction.checkpairwithgivensuminanarray;
import java.util.*;
public class SumOfArray {

        public static boolean hasPairWithSum(int[] arr, int target) {
            Set<Integer> seen = new HashSet<>();

            for (int num : arr) {
                int complement = target - num;
                if (seen.contains(complement)) {
                    System.out.println("Pair found: (" + num + ", " + complement + ")");
                    return true;
                }
                seen.add(num); // Store current number
            }

            return false;
        }
}
