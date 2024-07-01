package com.tiagocordeiro.course.repositories;

import com.tiagocordeiro.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
