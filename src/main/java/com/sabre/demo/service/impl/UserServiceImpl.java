package com.sabre.demo.service.impl;

import com.sabre.demo.dao.UserDAO;
import com.sabre.demo.domain.entity.User;
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
    public void delete(User entity) throws Exception {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findBySample(User sample) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(User sample) {
        return null;
    }

    @Override
    public Page<User> findAll(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<User> findAll(User sample, PageRequest pageRequest) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return dao.findByUsername(name);
    }

    @Override
    public User getUserById(long id) {
        return dao.findOne(id);
    }

    @Override
    public User save(User entity) {
        return dao.save(entity);
    }
}
