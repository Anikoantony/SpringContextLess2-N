package ru.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Component
@Scope("prototype") // для того чтобы при каждой инициализации бина корзина создавалась новая 4. При каждом запросе корзины из контекста, должна создаваться новая корзина.
public class Cart {

    List<Product> inCarts;

    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void init()
    {
        inCarts=new ArrayList<>();
    }

    public void addByIdProduct(Long id)
    {
        System.out.println("В корзину добавлен продукт " + productRepository.findById(id).getTitle());
         inCarts.add(productRepository.findById(id));
    }

    public void removeByIdProduct(Long id)
    {
        System.out.println("Из корзины удален продукт " + productRepository.findById(id).getTitle());
        inCarts.remove(productRepository.findById(id));
    }

    public List<Product> getInCarts() {
        return inCarts;

    }

    public void ShowCarts() {

        Iterator iterator=inCarts.iterator();
        for (Product product:inCarts
             ) {
            System.out.println("В корзине продукт № "+ product.getTitle());
        }

    }
}
