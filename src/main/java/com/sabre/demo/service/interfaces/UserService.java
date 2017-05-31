package com.sabre.demo.service.interfaces;

import com.sabre.base.service.BaseService;
import com.sabre.demo.domain.entity.User;

/**
 * FileName: UserService
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
public interface UserService extends BaseService<User>{

    User getUserByName(String name);

    User getUserById(long id);

    User save(User entity);

}
