package com.zjw.springbootday02.service.user;


import com.zjw.springbootday02.entities.User;

/**
 * @author zhjw
 * @date 2020-03-30 13:14
 */

public interface UserService {
    User queryByUserName(User user);
}
