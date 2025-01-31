package Day3.Selectionsort;
import java.sql.SQLOutput;
import java.util.*;
public class SortExamScores {
    public static void selectionSort(int arr[]){
        System.out.print("Sorted Exam scores are: ");
    for(int i=0; i< arr.length; i++){
        System.out.print(arr[i]+ "  ");
    }
}
            public static void main (String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number of students:");
                int n = sc.nextInt();
                int[] arr=new int[n];
                for (int i=0; i<arr.length; i++){
                    System.out.println(arr[i] + " Enter the marks of student: "+ (i+1));
                    arr[i]=sc.nextInt();
                }
                for(int i=0; i<arr.length-1;i++){
                    int s=i;
                    for( int j=i+1; j<arr.length; j++) {
                        if (arr[j] < arr[s]) {
                            s = j;
                        }
                    }
                            int temp= arr[s];
                            arr[s]=arr[i];
                            arr[i]=temp;
                    }

                selectionSort(arr);

}
}
