package com.sabre.demo.service.interfaces;

import com.sabre.demo.pojo.entity.UserEntity;

/**
 * FileName: UserService
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
public interface UserService {

    UserEntity getUserByName(String name);

    UserEntity getUserById(long id);

    UserEntity save(UserEntity entity);

}
