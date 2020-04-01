package com.zjw.springbootday02.service.user.Impl;

import com.zjw.springbootday02.dao.user.UserDao;
import com.zjw.springbootday02.entities.User;
import com.zjw.springbootday02.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhjw
 * @date 2020-03-30 13:18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User queryByUserName(User user) {
        User queryByUserName = userDao.queryByUserName(user);
        return queryByUserName;
    }
}
