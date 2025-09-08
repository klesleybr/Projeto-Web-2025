package com.project.backend_web.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend_web.domain.products.Product;

public interface ProductInterface extends JpaRepository<Product, UUID>{

}
