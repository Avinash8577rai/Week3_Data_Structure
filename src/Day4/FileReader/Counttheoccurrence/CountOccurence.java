package Day4.FileReader.Counttheoccurrence;
import java.io.*;
public class CountOccurence {
        public static void main(String[] args) {

            String filePath = "C:\\Users\\AVINASH KUMAR RAI\\Desktop\\capgemini training\\Week3\\src\\Day4\\FileReader\\Readfilelinebyline\\java notes.txt";
            String targetWord = "java";


            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            int wordCount = 0;

            try {

                fileReader = new FileReader(filePath);
                bufferedReader = new BufferedReader(fileReader);

                String line;


                while ((line = bufferedReader.readLine()) != null) {

                    String[] words = line.split("\\s+");


                    for (String word : words) {
                        if (word.equalsIgnoreCase(targetWord)) {
                            wordCount++;
                        }
                    }
                }


                System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");
            } catch (IOException e) {

                e.printStackTrace();
            } finally {
                try {

                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (fileReader != null) {
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

