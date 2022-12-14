package ru.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
  private List<Product> products;

  @PostConstruct
    public void init()
  {
      products = new ArrayList<>(Arrays.asList(
              new Product(1L, "Bread"),
              new Product(2L, "Milk"),
              new Product(3L, "Orange"),
              new Product(4L, "Potato")

      ));
  }

  public Product findById(Long id)
  {
    return products.stream().filter(p->p.getId().equals(id)).findFirst().orElseThrow(()->new RuntimeException());
  }

  public List<Product> getAllProducts()
  {
    return products;
  }


}
