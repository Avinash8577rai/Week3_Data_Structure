package Day4.Stringbuilder.problem1;
import java.util.*;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the String;");
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string is :" +sb);

    }
}
