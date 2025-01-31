package Day3.Quicksort;

import java.util.Scanner;

public class SortProductPrices {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=arr[i];
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pindex= partition(arr, low, high);
            quickSort(arr, low, pindex-1);
            quickSort(arr, pindex+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        int[] prices = new int[n];
        System.out.println("Enter the prices of the products:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Perform Merge Sort
        quickSort(prices, 0, n - 1);


        System.out.print("Sorted product prices in ascending order:");
        for (int price : prices) {
            System.out.println(price);
        }
    }
}

