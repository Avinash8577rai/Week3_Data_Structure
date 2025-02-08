package Day6.RecursivevsIterativeComparsion;

public class FibnacciComparison {
    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};


        for (int n : testValues) {

            long startTimeRecursive = System.nanoTime();
            try {
                int resultRecursive = FibnacciRecursive.fibonacciRecursive(n);
                long endTimeRecursive = System.nanoTime();
                long durationRecursive = endTimeRecursive - startTimeRecursive;
                System.out.println("Recursive Fibonacci(" + n + ") = " + resultRecursive + " | Time: " + durationRecursive / 1_000_000 + "ms");
            } catch (StackOverflowError e) {
                System.out.println("Recursive Fibonacci(" + n + ") is infeasible due to StackOverflow");
            }


            long startTimeIterative = System.nanoTime();
            int resultIterative = FibnacciIterative.fibonacciIterative(n);
            long endTimeIterative = System.nanoTime();
            long durationIterative = endTimeIterative - startTimeIterative;
            System.out.println("Iterative Fibonacci(" + n + ") = " + resultIterative + " | Time: " + durationIterative / 1_000_000 + "ms\n");
        }
    }
}
