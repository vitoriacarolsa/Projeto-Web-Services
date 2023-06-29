package com.devsuperior.cursoSpring.repositories;

import com.devsuperior.cursoSpring.entities.OrderItem;
import com.devsuperior.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
