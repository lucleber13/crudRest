package com.cbcode.crudrest.service;

import com.cbcode.crudrest.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
