package tdtu.edu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Product product = context.getBean("product",Product.class);
        Product product1 = context.getBean("product1",Product.class);
        Product product2 = context.getBean("product2",Product.class);

        System.out.println("Product: " + product.getName() + " (ID: " + product.getId() + ")");
        System.out.println("Product1: " + product1.getName() + " (ID: " + product1.getId() + ")");
        System.out.println("Product2: " + product2.getName() + " (ID: " + product2.getId() + ")");

    }
}
