package Day4.FileReader.Readfilelinebyline;
import java.io.*;

public class ReadFileLineByLine {

        public static void main(String[] args) {

            String filePath = "C:\\Users\\AVINASH KUMAR RAI\\Desktop\\capgemini training\\Week3\\src\\Day4\\FileReader\\Readfilelinebyline\\java notes.txt";

            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            try {

                fileReader = new FileReader(filePath);
                bufferedReader = new BufferedReader(fileReader);

                String line;


                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
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

