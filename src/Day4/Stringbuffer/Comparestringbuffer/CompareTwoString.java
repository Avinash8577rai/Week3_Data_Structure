package Day4.Stringbuffer.Comparestringbuffer;

import java.util.*;
public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size Of String Array:");;
        int n= sc.nextInt();
        String[] str= new String[n+1];
        System.out.println("Enter the Strings: ");
        for(int i=0; i<=n; i++) {
            str[i] = sc.nextLine();
        }
        long startTimeBuffer = System.nanoTime();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <n; i++) {
            sb.append(str[i]+" ");
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;


        long startTimeBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append(str[i]+" ");
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;


        System.out.println("Time taken for StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken for StringBuilder: " + durationBuilder + " nanoseconds");


                if (durationBuffer < durationBuilder) {
                    System.out.println("StringBuffer is faster.");
                } else {
                    System.out.println("StringBuilder is faster.");
                }
            }
        }