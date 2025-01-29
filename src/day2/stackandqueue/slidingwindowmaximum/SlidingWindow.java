package day2.stackandqueue.slidingwindowmaximum;
import java.util.*;
public class SlidingWindow {
    public static int[] MaxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Result array
        Deque<Integer> deque = new LinkedList<>(); // Deque stores indices

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of this window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements (they won’t be needed)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current index
            deque.offerLast(i);

            // Store the maximum of the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
