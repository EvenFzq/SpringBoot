package com.fzq.springboot_mybatis.controller;

import com.fzq.springboot_mybatis.domain.User;
import com.fzq.springboot_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fuziqin
 * ヾ(๑╹◡╹)ﾉ"
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public List<User> getUser() {
        List<User> list = userMapper.queryUserList();
        return list;
    }
}
