package Day5.BinarySearch.Findpeakelement;

import java.util.*;
public class PeakElement {
    public static int findPeakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;

            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            }
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }


            else {
                start = mid + 1;
            }
        }
        return-1;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " elements of an array;");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int peak= findPeakElement(arr);
        System.out.println("Peak element is : "+ peak);

    }
    }

