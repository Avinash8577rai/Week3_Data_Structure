package Day6.Sortingcomparsion;
import java.util.*;
public class SortingComparsion {

        public static void main(String[] args) {
            int[] sizes = {1000, 10000, 1000000};

            for (int size : sizes) {
                System.out.println("Sorting with N = " + size);
                int[] arrBubble = generateRandomArray(size);
                int[] arrMerge = Arrays.copyOf(arrBubble, arrBubble.length);
                int[] arrQuick = Arrays.copyOf(arrBubble, arrBubble.length);


                long startTime = System.currentTimeMillis();
                BubbleSort.sort(arrBubble);
                long endTime = System.currentTimeMillis();
                System.out.println("Bubble Sort took: " + (endTime - startTime) + "ms");


                startTime = System.currentTimeMillis();
                MergeSort.sort(arrMerge);
                endTime = System.currentTimeMillis();
                System.out.println("Merge Sort took: " + (endTime - startTime) + "ms");


                startTime = System.currentTimeMillis();
                QuickSort.sort(arrQuick);
                endTime = System.currentTimeMillis();
                System.out.println("Quick Sort took: " + (endTime - startTime) + "ms");

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


