package com.ecommerce.microcommerce.Dao;

import com.ecommerce.microcommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
    Product findById(int id);
    List<Product> findByPrixGreaterThan(int prixLimit);

    Product save(Product product);
}