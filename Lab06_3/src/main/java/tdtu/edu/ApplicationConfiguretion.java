package tdtu.edu;

import org.springframework.context.annotation.Bean;

public class ApplicationConfiguretion {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor();
    }

    @Bean
    public TextWriter plainTextWriter() {
        return new PlainTextWriter();
    }

    @Bean
    public TextWriter pdfTextWriter() {
        return new PdfTextWriter();
    }
}
