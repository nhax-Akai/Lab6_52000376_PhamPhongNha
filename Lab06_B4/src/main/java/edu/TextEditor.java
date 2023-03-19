package edu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class TextEditor {

    public String text;

    private TextWriter textWriter;

    public void input(String text) {
        this.text = text;
    }

    public void save(String filename) throws Exception {
        textWriter.write(filename, this.text);
    }
}
