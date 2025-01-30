package day2.stackandqueue.circulartourproblem;
import java.util.*;
public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();
        int total_petrol = 0, curr_petrol = 0, start = 0;

        for (int i = 0; i < n; i++) {
            int surplus = petrol[i] - distance[i];
            total_petrol += surplus;
            curr_petrol += surplus;
            queue.offer(i);

            // If current petrol becomes negative, remove elements from the queue
            while (curr_petrol < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                curr_petrol -= (petrol[removed] - distance[removed]);
                start = removed + 1;
            }
        }

        // If total petrol is negative, no valid start exists
        return (total_petrol >= 0) ? start : -1;
    }

}
