package Day6.ComparingDataStructures;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        int[] datasetSizes = {1000, 100000, 1000000};


        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch();
        TreeSetSearch treeSetSearch = new TreeSetSearch();


        for (int N : datasetSizes) {
            System.out.println("Dataset Size: " + N);


            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = i + 1;
            }

            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < N; i++) {
                hashSet.add(i + 1);
            }

            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                treeSet.add(i + 1);
            }


            int target = N / 2;


            long arraySearchTime = arraySearch.search(array, target);
            System.out.println("Array Search Time (O(N)): " + arraySearchTime / 1000000.0 + " ms");


            long hashSetSearchTime = hashSetSearch.search(hashSet, target);
            System.out.println("HashSet Search Time (O(1)): " + hashSetSearchTime / 1000000.0 + " ms");


            long treeSetSearchTime = treeSetSearch.search(treeSet, target);
            System.out.println("TreeSet Search Time (O(log N)): " + treeSetSearchTime / 1000000.0 + " ms");

            System.out.println();
        }
    }
}
