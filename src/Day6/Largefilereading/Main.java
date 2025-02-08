package Day6.Largefilereading;

public class Main {

        public static void main(String[] args) {
            String filePath = "C:\\Users\\AVINASH KUMAR RAI\\Desktop\\capgemini training\\Week3\\src\\Day6\\Largefilereading\\large_file1.txt"; // Change path as needed

            // Using FileReader
            FileReaders fileReaderTest = new FileReaders();
            fileReaderTest.readFile(filePath);

            // Using InputStreamReader
            InputStreamReaders inputStreamReaderTest = new InputStreamReaders();
            inputStreamReaderTest.readFile(filePath);
        }
    }

