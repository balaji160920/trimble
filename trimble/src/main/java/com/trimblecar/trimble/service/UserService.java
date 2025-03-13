package com.trimblecar.trimble.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.trimblecar.trimble.model.User;
import com.trimblecar.trimble.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

