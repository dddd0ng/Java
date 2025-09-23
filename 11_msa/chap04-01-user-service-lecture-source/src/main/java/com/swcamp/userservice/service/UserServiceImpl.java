package com.swcamp.userservice.service;

import com.swcamp.userservice.dto.UserDTO;
import com.swcamp.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Override
    public void registUser(UserDTO userDTO) {

    }
}
