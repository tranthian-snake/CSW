package com.example.tranthian.controller;

import com.example.tranthian.entity.Product;
import com.example.tranthian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "list";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        Product product=new Product();
        model.addAttribute("product", product);
        return "add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product, Model model) {
        productService.addProduct(product);
        return "redirect:/list";
    }
}
