package com.example.springbootexample.controller;

import com.example.springbootexample.entity.Product;
import com.example.springbootexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product){
        return service.saveProducts(product);
    }

    @GetMapping("/Products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/ProductsById/{id}")
    public Product findById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/Products/{name}")
    public Product findByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/DeleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
