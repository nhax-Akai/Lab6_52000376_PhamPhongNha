package org.example;

import edu.tdtu.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        Product product1 = (Product) context.getBean("product1");
        Product product2 = (Product) context.getBean("product2");
        Product product3 = (Product) context.getBean("product3");

        System.out.println("Name of the bean 1: "+ product1.getName());
        System.out.println("Name of the bean 2: "+ product2.getName());
        System.out.println("Name of the bean 3: "+ product3.getName());

        System.out.println("Information: "+product1.toString());
        System.out.println("Information: "+product3.toString());
    }
}
