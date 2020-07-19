package com.funlab.spotty.controller;

import com.funlab.spotty.entity.User;
import com.funlab.spotty.exception.ResourceNotFoundException;
import com.funlab.spotty.repository.UserRepository;
import com.funlab.spotty.security.CurrentUser;
import com.funlab.spotty.security.UserPrincipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }

}