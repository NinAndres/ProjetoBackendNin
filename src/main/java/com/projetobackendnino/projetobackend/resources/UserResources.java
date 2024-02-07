package com.projetobackendnino.projetobackend.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetobackendnino.projetobackend.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Jose Teixeira", "jose@gmail.com", "45999774422", "12345");
    return ResponseEntity.ok().body(u);
  }

}
