package csv.performance;

import java.io.IOException;

public interface CsvReader {

    long processFile(String path) throws IOException;
    String[] processLine(String line);
}