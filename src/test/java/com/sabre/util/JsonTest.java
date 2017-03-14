package com.sabre.util;

import com.alibaba.fastjson.JSON;
import com.sabre.base.pojo.param.req.ReqHeadParam;
import com.sabre.base.pojo.param.req.ReqMessageParam;
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

        ReqHeadParam headParam = new ReqHeadParam();
        headParam.setAppId("111");
        headParam.setSign("222");

        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("BBB");
        String bodyStr = JSON.toJSONString(userEntity);

        ReqMessageParam reqMessageParam = new ReqMessageParam(headParam,bodyStr);

        String jsonString = JSON.toJSONString(reqMessageParam);
        System.out.println(jsonString);
    }


}
