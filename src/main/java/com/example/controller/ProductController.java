package com.example.controller;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@EnableDiscoveryClient
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/webpage")
    public String hello(){
        return "products";
    }


    @GetMapping("/api/products")
    public String getProducts(@RequestParam String param, Model model) {
        List<Product> products = productService.getProducts(param);
        model.addAttribute("products",products);
        return "products";
    }
}