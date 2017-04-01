package com.sabre.demo.controller;

import com.alibaba.fastjson.JSON;
import com.sabre.base.controller.BaseController;
import com.sabre.base.pojo.param.req.ReqMessageParam;
import com.sabre.base.aop.ControllerLog;
import com.sabre.demo.pojo.entity.UserEntity;
import com.sabre.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * FileName: UserController
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-14
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/get/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ControllerLog
    public UserEntity getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }


    @PostMapping(value = "/user/get",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ControllerLog
    public UserEntity getUser(@RequestBody ReqMessageParam param){
        UserEntity user = JSON.parseObject(param.getBody(), UserEntity.class);
        return userService.getUserByName(user.getName());
    }


}
