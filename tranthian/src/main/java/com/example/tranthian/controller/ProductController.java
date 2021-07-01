package com.example.tranthian.controller;

import com.example.tranthian.entity.Product;
import com.example.tranthian.model.BaseResponse;
import com.example.tranthian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

//    @GetMapping
//    public ResponseEntity getProductByName(@RequestParam(value = "name", required = false) String name) {
//        BaseResponse res = new BaseResponse();
//        if (name != null){
//            res.data = productService.getProductByName(name);
//        }else {
//            res.data = productService.getAll();
//        }
//        return ResponseEntity.ok(res);
//    }

    @GetMapping
    public ResponseEntity getAllProducts() {
        List<Product> data= productService.getAllProducts();
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Product p){
        Product data = productService.addProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody Product p) {
        Product data = productService.updateProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

}
