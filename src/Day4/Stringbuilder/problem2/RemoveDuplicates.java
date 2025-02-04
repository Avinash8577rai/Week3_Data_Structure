package Day4.Stringbuilder.problem2;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the input String: ");
        String str = sc.nextLine();
        str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }
        System.out.print("String after Removing Duplicate Characters; " + sb.toString());

    }
}
