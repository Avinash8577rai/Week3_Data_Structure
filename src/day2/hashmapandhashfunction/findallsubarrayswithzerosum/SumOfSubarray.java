package day2.hashmapandhashfunction.findallsubarrayswithzerosum;
import java.util.*;
public class SumOfSubarray {
        public static List<int[]> findZeroSumSubarrays(int[] arr) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            List<int[]> result = new ArrayList<>();
            int sum = 0;

            // Add base case: sum 0 at index -1 (for subarrays starting at index 0)
            map.put(0, new ArrayList<>());
            map.get(0).add(-1);

            // Traverse array
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];  // Compute cumulative sum

                // If sum has appeared before, subarrays exist
                if (map.containsKey(sum)) {
                    for (int start : map.get(sum)) {
                        result.add(new int[]{start + 1, i}); // Store (start+1, i) as subarray indices
                    }
                }

                // Store current sum's index
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(i);
            }

            return result;
        }

    }
