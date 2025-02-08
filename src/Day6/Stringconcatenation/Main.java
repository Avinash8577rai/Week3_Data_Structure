package Day6.Stringconcatenation;

public class Main {
    public static void main(String[] args) {
        int n = 1000000;


        long startTime = System.currentTimeMillis();
        long resultString = StringConcatenation.concatenate(n);
        long endTime = System.currentTimeMillis();
        System.out.println("String Concatenation took: " + (endTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        long resultStringBuilder = StringBuilders.concatenate(n);
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Concatenation took: " + (endTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        long resultStringBuffer = StringBuffers.concatenate(n);
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Concatenation took: " + (endTime - startTime) + "ms");
    }
}
