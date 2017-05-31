package com.sabre.demo.dao;

import com.sabre.base.dao.BaseDao;
import com.sabre.demo.domain.entity.User;

/**
 * FileName: UserDAO
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
public interface UserDAO extends BaseDao<User,Long> {

    User findByUsername(String username);

}
