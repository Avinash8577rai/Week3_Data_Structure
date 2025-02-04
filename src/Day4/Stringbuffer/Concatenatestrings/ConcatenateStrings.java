package Day4.Stringbuffer.Concatenatestrings;

import java.util.*;
public class ConcatenateStrings {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size Of String Array:");;
        int n= sc.nextInt();
         String[] str= new String[n+1];
        System.out.println("Enter the Strings: ");
        for(int i=0; i<=n; i++) {
            str[i] = sc.nextLine();
        }
        StringBuffer sb= new StringBuffer();

        for (String string: str) {
            sb.append(string+ " ");
        }

        System.out.println("Concatenated string: " + sb.toString());
    }


    }
