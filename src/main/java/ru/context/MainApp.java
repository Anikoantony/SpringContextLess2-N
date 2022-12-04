package ru.context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Box.class);
        Box box1 = context.getBean(Box.class);
        box1.setColor("gree");
        System.out.println(box1.getColor());
        context.close();
    }
}
