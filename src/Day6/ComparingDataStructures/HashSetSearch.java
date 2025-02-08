package Day6.ComparingDataStructures;
import java.util.*;
public class HashSetSearch {
    public long search(HashSet<Integer> set, int target) {
        long startTime = System.nanoTime();
        set.contains(target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
