package com.sontekin.emrullah.productservice.repository;

import com.sontekin.emrullah.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
