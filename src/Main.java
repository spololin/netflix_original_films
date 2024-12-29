import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List fileLines = getFileLines();

        System.out.println("Number of lines: " + fileLines.size());
    }


    private static List getFileLines() throws IOException {
        final String COMMA_DELIMITER = ",";
        List records = new ArrayList();

        BufferedReader br = new BufferedReader(new FileReader("static/files/NetflixOriginals.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }

        return records;
    }
}
