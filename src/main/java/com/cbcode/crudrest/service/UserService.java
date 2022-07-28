package com.cbcode.crudrest.service;

import com.cbcode.crudrest.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUser(String email);

    UserDto getUserByUserId(String userId);
}
