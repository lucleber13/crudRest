package com.cbcode.crudrest.service.impl;

import com.cbcode.crudrest.UserRepositoy;
import com.cbcode.crudrest.io.entity.UserEntity;
import com.cbcode.crudrest.service.UserService;
import com.cbcode.crudrest.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {

    @Autowired
    UserRepositoy userRepositoy;
    @Override
    public UserDto createUser(UserDto user) {

        if(userRepositoy.findByEmail(user.getEmail()) != null) throw new RuntimeException("Record already exists.");

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("testUserId");

        UserEntity storedUserDetails = userRepositoy.save(userEntity);

        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValue);

        return returnValue;
    }
}
