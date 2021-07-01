package com.example.tranthian.service;


import com.example.tranthian.entity.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(Product p);
    Product updateProduct(Product product);
    Product sellProduct(int productId, int quantity);
    int getTotalPage(Pageable pageable);
    Product getProductById(int id);
}
