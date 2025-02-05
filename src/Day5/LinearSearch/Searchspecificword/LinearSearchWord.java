package Day5.LinearSearch.Searchspecificword;

import java.util.Scanner;

public class LinearSearchWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an String:");
        int n = sc.nextInt();

        String[] str = new String[n];
        System.out.println("Enter the " + n + " sentence of an String;");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("Enter the word to search:");
        String word = sc.nextLine();

        String result = findSentenceWord(str, word);


        System.out.println(result);
    }


    public static String findSentenceWord(String[] str, String word) {

        for (String str1 : str) {
            if (str1.contains(word)) {
                return str1;
            }
        }

            return "Not found!";
        }
    }

