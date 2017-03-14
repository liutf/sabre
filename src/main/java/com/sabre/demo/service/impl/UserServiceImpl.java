package com.sabre.demo.service.impl;

import com.sabre.demo.dao.UserDAO;
import com.sabre.demo.pojo.entity.UserEntity;
import com.sabre.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FileName: UserServiceImpl
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    @Override
    public UserEntity getUserByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public UserEntity getUserById(long id) {
        return dao.findOne(id);
    }

    @Override
    public UserEntity save(UserEntity entity) {
        return dao.save(entity);
    }
}
