package com.trimblecar.trimble.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trimblecar.trimble.model.User;
import com.trimblecar.trimble.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	  private final UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @PostMapping("/register")
	    public ResponseEntity<User> registerUser(@RequestBody User user) {
	        System.out.println("Received User: " + user);
	        User newUser = userService.registerUser(user);
	        return ResponseEntity.ok(newUser);
	    }


	    @GetMapping("/all")
	    public ResponseEntity<List<User>> getAllUsers() {
	        return ResponseEntity.ok(userService.getAllUsers());
	    }

	    @GetMapping("/find")
	    public ResponseEntity<Optional<User>> getUserByUsername(@RequestParam String username) {
	        return ResponseEntity.ok(userService.getUserByUsername(username));
	    }
	}
