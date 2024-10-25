package com.leohean.my_own_market.service;

import com.leohean.my_own_market.model.Market;
import com.leohean.my_own_market.model.Product;
import com.leohean.my_own_market.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Integer idProduct){
        Optional<Product> optionalProduct = productRepository.findById(idProduct);

        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }else{
            return null;
        }
    }

    public Product saveProduct(Product product){
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    public Product updateProduct(Product product){
        Optional<Product> optionalProduct = productRepository.findById(product.getIdProduct());

        if(optionalProduct.isPresent()){
            Product updatedProduct = productRepository.save(product);
            return updatedProduct;
        }else{
            return null;
        }
    }

    public void deleteProduct(Integer idProduct){
        productRepository.deleteById(idProduct);
    }
}
