package dev.evgeni.csv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvUtils {

    public static void parseCsv(String filePath) throws IOException {
        Reader in = new FileReader(filePath);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
        for (CSVRecord record : records) {
            List<String> firstColumn = record.toList();
            System.out.println(String.join(",", firstColumn));
        }
        
    }
    
}
