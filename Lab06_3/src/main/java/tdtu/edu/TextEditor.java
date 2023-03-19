package tdtu.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
    private String text;
    @Autowired
    @Qualifier("plainTextWriter")
    private TextWriter textWriter;

    public void input(String text) {
        this.text = text;
    }

    public void save(String filename) throws Exception {
        textWriter.write(filename, this.text);
    }
}
