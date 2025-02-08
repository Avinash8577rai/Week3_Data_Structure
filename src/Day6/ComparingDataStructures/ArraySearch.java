package Day6.ComparingDataStructures;

public class ArraySearch {
    public long search(int[] array, int target) {
        long startTime = System.nanoTime();
        for(int i =0; i< array.length; i++) {
            if (array[i] == target) {
                break;
            }
        }
            long endTime = System.nanoTime();
            return endTime-startTime;
        }
    }
