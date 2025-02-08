package Day6.ComparingDataStructures;
import java.util.*;
public class TreeSetSearch {
    public long search(TreeSet<Integer> set, int target) {
        long startTime = System.nanoTime();
        set.contains(target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
