package Day3.Countingsort;
import java.util.*;
public class SortStudentAges {

        public static void countingSort(int[] arr) {
            int n = arr.length;


            int[] count = new int[19];
            int[] output = new int[n];


            for (int i = 0; i < n; i++) {
                count[arr[i] - 10]++;
            }


            for (int i = 1; i < 19; i++) {
                count[i] += count[i - 1];
            }


            for (int i = n - 1; i >= 0; i--) {
                int age = arr[i];
                output[count[age - 10] - 1] = age;
                count[age - 10]--;
            }


            System.arraycopy(output, 0, arr, 0, n);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter the number of students:");
            int n = sc.nextInt();


            int[] arr = new int[n];
            System.out.println("Enter the ages of students (between 10 and 18):");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }


            countingSort(arr);


            System.out.println("Sorted ages of students:");
            for (int age : arr) {
                System.out.print(age + " ");
            }
        }
    }


