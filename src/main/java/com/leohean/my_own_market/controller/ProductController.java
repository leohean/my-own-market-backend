package com.leohean.my_own_market.controller;

import com.leohean.my_own_market.model.Product;
import com.leohean.my_own_market.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok().body(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer idProduct){
        return ResponseEntity.ok().body(productService.getProductById(idProduct));
    }

    @PostMapping("/")
    public ResponseEntity saveProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.saveProduct(product));
    }

    @PutMapping("/")
    public ResponseEntity updateProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.updateProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer idProduct){
        productService.deleteProduct(idProduct);
        return ResponseEntity.ok().body("Product was deleted successfully");
    }
}
