package tdtu.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguretion.class);
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.input("Spring !!");
        try {
            textEditor.save("output.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
