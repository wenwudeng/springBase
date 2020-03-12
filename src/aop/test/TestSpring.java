package aop.test;

import aop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext2.xml"});
       /*面向切面编程*/
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}
