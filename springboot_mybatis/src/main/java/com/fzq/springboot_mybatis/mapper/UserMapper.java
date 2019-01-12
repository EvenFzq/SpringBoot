package com.fzq.springboot_mybatis.mapper;

import com.fzq.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Fuziqin
 * ヾ(๑╹◡╹)ﾉ"
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
