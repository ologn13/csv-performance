package csv.performance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7Base implements CsvReader {

    @Override
    public long processFile(String path) throws IOException {
        long lineCount = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] fields = processLine(line);
                lineCount++;
            }
          }
        
        return lineCount;
    }

    @Override
    public String[] processLine(String line) {
        return line.split(",", -1);
    }
}
