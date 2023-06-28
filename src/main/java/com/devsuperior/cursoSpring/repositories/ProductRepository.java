package com.devsuperior.cursoSpring.repositories;

import com.devsuperior.cursoSpring.entities.Category;
import com.devsuperior.cursoSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {



}
