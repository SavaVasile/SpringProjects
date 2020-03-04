package com.springProject.spring.service;

import com.springProject.spring.dto.UserRegistrationDTO;
import com.springProject.spring.model.LocalUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    LocalUser findByEmail (String email);
    LocalUser save (UserRegistrationDTO userDTO);
}
