package ru.context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("ru.context");
        OrderService orderService=context.getBean(OrderService.class);
        orderService.createOrderFromProduct(2L);
        Cart cart1=context.getBean(Cart.class);
        Cart cart2=context.getBean(Cart.class);
        cart2.addByIdProduct(3L);
        cart1.addByIdProduct(1L);
        cart1.addByIdProduct(1L);
        cart1.addByIdProduct(2L);
        cart1.ShowCarts();
        cart1.removeByIdProduct(1L);
        cart1.removeByIdProduct(1L);
        cart1.removeByIdProduct(1L);
        cart1.ShowCarts();
        cart2.ShowCarts();
        context.close();
    }
}
