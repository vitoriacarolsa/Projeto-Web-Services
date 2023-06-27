package com.devsuperior.cursoSpring.repositories;

import com.devsuperior.cursoSpring.entities.Order;
import com.devsuperior.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {



}
