package com.sabre.demo.controller;

import com.sabre.base.aop.ControllerLog;
import com.sabre.base.controller.BaseController;
import com.sabre.demo.domain.entity.User;
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
    public User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }


    @PostMapping(value = "/user/get",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ControllerLog
    public User getUser(@RequestBody User user){
        return userService.getUserByName(user.getUsername());
    }


}
