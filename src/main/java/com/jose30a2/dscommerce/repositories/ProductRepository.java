package com.jose30a2.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jose30a2.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
