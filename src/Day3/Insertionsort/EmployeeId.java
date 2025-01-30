package Day3.Insertionsort;

import java.util.Scanner;
public class EmployeeId {
    public static void bubblesort(int[] arr) {
        System.out.print(" Sorted Employee id  is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employee: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " Enter the employee id of Employee: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        bubblesort(arr);
    }
}

