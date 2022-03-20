package com.example.log_registration.service;

import com.example.log_registration.dto.UserRegistrationDto;
import com.example.log_registration.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

     User save(UserRegistrationDto userRegistrationDto);
}
