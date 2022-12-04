package ru.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private ProductService productService;
    public void createOrderFromProduct(Long productId)
    {
        System.out.println("Заказ создан: \n"+ productService.getTitleById(productId));
    }

}
