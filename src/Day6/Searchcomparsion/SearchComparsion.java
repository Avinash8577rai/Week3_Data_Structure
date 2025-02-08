package Day6.Searchcomparsion;
import java.util.*;
public class SearchComparsion {
        public static void main(String[] args) {
            int[] sizes = {1000, 10000, 1000000}; // Dataset sizes to test
            int target = -1; // Target value to search for

            for (int size : sizes) {
                System.out.println("Searching with N = " + size);

                // Generate a random array
                int[] arrLinear = generateRandomArray(size);
                int[] arrBinary = Arrays.copyOf(arrLinear, arrLinear.length); // Copy for binary search

                // Linear Search
                long startTime = System.currentTimeMillis();
                LinearSearch.search(arrLinear, target);
                long endTime = System.currentTimeMillis();
                System.out.println("Linear Search took: " + (endTime - startTime) + "ms");

                // Binary Search
                startTime = System.currentTimeMillis();
                BinarySearch.search(arrBinary, target);
                endTime = System.currentTimeMillis();
                System.out.println("Binary Search took: " + (endTime - startTime) + "ms");

                System.out.println();
            }
        }

        private static int[] generateRandomArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = (int) (Math.random() * size);
            }
            return arr;
        }
    }


