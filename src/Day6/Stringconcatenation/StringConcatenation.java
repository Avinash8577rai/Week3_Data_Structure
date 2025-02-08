package Day6.Stringconcatenation;

public class StringConcatenation {
    public static long concatenate(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        return result.length(); // Return the length for demonstration purposes
    }
}

