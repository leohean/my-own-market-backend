package com.leohean.my_own_market.repository;

import com.leohean.my_own_market.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
