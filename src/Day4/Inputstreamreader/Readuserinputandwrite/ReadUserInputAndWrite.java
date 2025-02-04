package Day4.Inputstreamreader.Readuserinputandwrite;
import java.io.*;
public class ReadUserInputAndWrite {

        public static void main(String[] args) {

            String filePath = "C:\\Users\\AVINASH KUMAR RAI\\Desktop\\capgemini training\\Week3\\src\\Day4\\FileReader\\Readfilelinebyline\\java notes.txt";

            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;

            try {

                inputStreamReader = new InputStreamReader(System.in);

                bufferedReader = new BufferedReader(inputStreamReader);


                fileWriter = new FileWriter(filePath, true);

                bufferedWriter = new BufferedWriter(fileWriter);

                String userInput;
                System.out.println("Enter your input. Type 'exit' to stop:");


                while (true) {

                    userInput = bufferedReader.readLine();


                    if (userInput.equalsIgnoreCase("exit")) {
                        break;
                    }


                    bufferedWriter.write(userInput);
                    bufferedWriter.newLine();
                }

                System.out.println("Input has been written to the file.");
            } catch (IOException e) {

                e.printStackTrace();
            } finally {
                try {

                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

