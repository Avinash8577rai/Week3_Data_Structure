package Day6.Largefilereading;
import java.io.IOException;
import java.io.*;
public class InputStreamReaders {


        public void readFile(String filePath) {
            File file = new File(filePath);
            long startTime = System.nanoTime();
            try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
                char[] buffer = new char[1024]; // 1KB buffer
                while (inputStreamReader.read(buffer) != -1) {
                    // Reading file data (byte to character conversion)
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("InputStreamReader took " + duration / 1_000_000 + " ms to read the file.");
        }
    }

