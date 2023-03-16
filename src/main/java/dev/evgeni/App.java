package dev.evgeni;

import java.io.IOException;
import dev.evgeni.csv.CsvUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            CsvUtils.parseCsv("./src/main/resources/olympic-data.csv");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
