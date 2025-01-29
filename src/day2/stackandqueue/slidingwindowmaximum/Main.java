package day2.stackandqueue.slidingwindowmaximum;
import java.util.*;
public class Main {
    public static void main(String[] args) {

                int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
                int k = 3;

                int[] result = SlidingWindow.MaxSlidingWindow(nums, k);
                System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
            }
        }



