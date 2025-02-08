package Day6.Stringconcatenation;
import java.util.*;
public class StringBuilder {
    public static long concatrnate(int a){
       StringBuilder result = new StringBuilder();
        for(int i=0; i<a; i++){
                result.append("x");
        }
        return result.length();
    }
}
