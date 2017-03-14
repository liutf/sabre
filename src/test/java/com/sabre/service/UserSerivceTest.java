package com.sabre.service;

import com.sabre.SabreApplicationTests;
import com.sabre.demo.pojo.entity.UserEntity;
import com.sabre.demo.service.interfaces.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * FileName: UserSerivceTest
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
public class UserSerivceTest extends SabreApplicationTests {

    @Autowired
    private UserService service;

    @Test
    public void test(){
        UserEntity entity = new UserEntity();
        entity.setName("aaa");
        entity.setAge(18);
        entity.setSex("male");
        entity.setState(1);

        UserEntity userEntity = service.save(entity);
        System.out.println("saved." + userEntity.getModifyDate());

        entity.setName("BBB");
        userEntity = service.save(entity);
        System.out.println("saved." + userEntity.getModifyDate());

    }

}
