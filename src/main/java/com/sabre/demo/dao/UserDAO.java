package com.sabre.demo.dao;

import com.sabre.base.dao.BaseDao;
import com.sabre.demo.pojo.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * FileName: UserDAO
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
@Repository
public interface UserDAO extends BaseDao<UserEntity,Long> {

    UserEntity findByName(String name);

}
