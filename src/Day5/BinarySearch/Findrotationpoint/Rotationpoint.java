package Day5.BinarySearch.Findrotationpoint;
import java.util.*;
public class Rotationpoint {
    public static int binarySearch(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start +(end-start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;

            }

        }
        return start;
    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the Array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the " + n + " elements of the Array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            int rotationpoint = binarySearch(arr);
            System.out.println("Enter the target element to find the rotation point:"+ rotationpoint);


        }

    }
