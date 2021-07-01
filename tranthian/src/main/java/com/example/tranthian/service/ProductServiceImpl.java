package com.example.tranthian.service;

import com.example.tranthian.entity.Product;
import com.example.tranthian.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product addProduct(Product p) {
        return productRepo.save(p);
    }

    @Override
    public Product updateProduct(Product p) {
        return productRepo.save(p);
    }

    @Override
    public Product sellProduct(int productId, int quantity) {
        return null;
    }

    @Override
    public int getTotalPage(Pageable pageable) {
        return productRepo.findAll(pageable).getTotalPages();
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }
}
