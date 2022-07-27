package com.cbcode.crudrest;

import com.cbcode.crudrest.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoy extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);

}
