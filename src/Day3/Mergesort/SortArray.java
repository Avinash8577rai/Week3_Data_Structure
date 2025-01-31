package Day3.Mergesort;
import java.util.*;
public class SortArray {
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si+(ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void conquer(int arr[], int si, int ei, int mid) {
        int[] merge = new int[ei - si + 1];
        int i1 = si;
        int i2 = mid + 1;
        int x = 0;
        while (i1 <= mid && i2 <= ei) {
            if (arr[i1] <= arr[i2]) {
                merge[x++] = arr[i1++];

            } else merge[x++] = arr[i2++];
        }
        while (i1 <= mid) {
            merge[x] = arr[i1];
            i1++;
            x++;
        }
        while (i2 <= ei) {
            merge[x] = arr[i2];
            i2++;
            x++;
        }
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];

        }
    }

        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the number of books: ");
            int n = sc.nextInt();


            int[] prices = new int[n];
            System.out.print("Enter the prices of the books:");
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }

            // Perform Merge Sort
            divide(prices, 0, n - 1);


            System.out.print("Sorted book prices in ascending order:");
            for (int price : prices) {
                System.out.println(price);
            }
        }

}



