package com.sabre.util;

import com.alibaba.fastjson.JSON;
import com.sabre.demo.pojo.entity.UserEntity;
import org.junit.Test;

/**
 * FileName: JsonTest
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-14
 */
public class JsonTest {

    @Test
    public void test(){


        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("BBB");
        String bodyStr = JSON.toJSONString(userEntity);

        System.out.println(bodyStr);
    }


}
