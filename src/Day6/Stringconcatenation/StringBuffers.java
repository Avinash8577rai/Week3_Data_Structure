package Day6.Stringconcatenation;

public class StringBuffers {

        public static long concatenate(int n) {
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < n; i++) {
                result.append("a");
            }
            return result.length(); // Return the length for demonstration purposes
        }
    }


