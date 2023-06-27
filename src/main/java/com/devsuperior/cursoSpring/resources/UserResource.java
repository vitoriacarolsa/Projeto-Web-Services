package com.devsuperior.cursoSpring.resources;

import com.devsuperior.cursoSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/Users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u=new User(1L, "Maria", "maria@gmail.com", "1111", "2343" );
        return ResponseEntity.ok().body(u);
    }
}
