package Day3.Bubblesort;
import java.util.Scanner;
public class StudentMarks {
    public static void bubblesort(int[] arr){
        System.out.print(" Sorted array is: " );
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ "  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n= sc.nextInt();


        int[] arr=new int[n];
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " Enter the marks of student: "+ (i+1));
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }

        }
        bubblesort(arr);
    }
}
