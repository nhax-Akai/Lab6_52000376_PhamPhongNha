package edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public interface TextWriter {
    public void write(String filename, String text) throws Exception;
}
