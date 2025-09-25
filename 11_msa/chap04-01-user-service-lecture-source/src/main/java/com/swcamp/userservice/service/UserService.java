package com.swcamp.userservice.service;

import com.swcamp.userservice.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    void registUser(UserDTO userDTO);

    UserDTO getUserById(String memNo);
}
