package com.devsuperior.cursoSpring.repositories;

import com.devsuperior.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {



}
