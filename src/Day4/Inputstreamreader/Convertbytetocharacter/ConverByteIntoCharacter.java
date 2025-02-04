package Day4.Inputstreamreader.Convertbytetocharacter;
import java.io.*;
public class ConverByteIntoCharacter {

        public static void main(String[] args) {

            String filePath = "C:\\Users\\AVINASH KUMAR RAI\\Desktop\\capgemini training\\Week3\\src\\Day4\\FileReader\\Readfilelinebyline\\java notes.txt";


            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;

            try {

                fileInputStream = new FileInputStream(filePath);


                inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");


                bufferedReader = new BufferedReader(inputStreamReader);

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
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

