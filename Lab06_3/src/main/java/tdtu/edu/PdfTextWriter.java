package tdtu.edu;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PdfTextWriter implements TextWriter {
    @Override
    public void write(String filename, String text) throws Exception {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filename));
        printWriter.println("Printing in PDF format");
        printWriter.println(text);
        printWriter.close();
    }
}
