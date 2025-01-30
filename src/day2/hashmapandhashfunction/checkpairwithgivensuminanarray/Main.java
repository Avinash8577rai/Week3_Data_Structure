package day2.hashmapandhashfunction.checkpairwithgivensuminanarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 10;

        if (!SumOfArray.hasPairWithSum(arr, target)) {
            System.out.println("No pair found.");
        }
    }

}
