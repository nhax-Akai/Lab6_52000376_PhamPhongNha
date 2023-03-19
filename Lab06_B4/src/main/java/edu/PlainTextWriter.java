package edu;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.PrintWriter;


public class PlainTextWriter implements TextWriter {
    @Override
    public void write(String filename, String text) throws Exception {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filename));
        printWriter.println("Printing in plain text format");
        printWriter.println(text);
        printWriter.close();
    }
}
