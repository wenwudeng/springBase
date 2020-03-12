package ioc.test;

import aop.service.ProductService;
import ioc.pojo.Category;
import ioc.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});


        Category category = (Category) context.getBean("c");
        System.out.println(category.toString());


        Product p = (Product) context.getBean("p");
        System.out.println(p.toString());

    }
}
