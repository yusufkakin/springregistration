package com.example.springregistration.service;

import com.example.springregistration.model.User;
import com.example.springregistration.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
