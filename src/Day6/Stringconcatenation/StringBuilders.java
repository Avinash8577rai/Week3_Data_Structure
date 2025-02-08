package Day6.Stringconcatenation;

public class StringBuilders {
    public static long concatenate(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.length(); // Return the length for demonstration purposes
    }
}


