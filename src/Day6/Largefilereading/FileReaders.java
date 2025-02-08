package Day6.Largefilereading;
import java.io.*;
public class FileReaders {

        public void readFile(String filePath) {
            File file = new File(filePath);
            long startTime = System.nanoTime();
            try (FileReader fileReader = new FileReader(file)) {
                char[] buffer = new char[1024]; // 1KB buffer
                while (fileReader.read(buffer) != -1) {
                    // Reading file data (character by character)
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("FileReader took " + duration / 1_000_000 + " ms to read the file.");
        }
    }

