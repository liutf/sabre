package com.sabre.demo.service.impl;

import com.sabre.demo.dao.UserDAO;
import com.sabre.demo.pojo.entity.UserEntity;
import com.sabre.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public void delete(Long id) throws Exception {
        dao.delete(id);
    }

    @Override
    public void delete(UserEntity entity) throws Exception {

    }

    @Override
    public UserEntity findById(Long id) {
        return null;
    }

    @Override
    public UserEntity findBySample(UserEntity sample) {
        return null;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public List<UserEntity> findAll(UserEntity sample) {
        return null;
    }

    @Override
    public Page<UserEntity> findAll(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<UserEntity> findAll(UserEntity sample, PageRequest pageRequest) {
        return null;
    }

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
