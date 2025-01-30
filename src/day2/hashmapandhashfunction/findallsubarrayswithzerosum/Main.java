package day2.hashmapandhashfunction.findallsubarrayswithzerosum;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, -6};
        List<int[]> subarrays = SumOfSubarray.findZeroSumSubarrays(arr);

        for (int[] subarray : subarrays) {
            System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
        }
    }
}

