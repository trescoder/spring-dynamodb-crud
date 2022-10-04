package com.tutorial.dynamocrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping("/users")
  public ResponseEntity<Iterable<User>> usersList(){
    return ResponseEntity.ok(userService.listOfUsers());
  }
}
