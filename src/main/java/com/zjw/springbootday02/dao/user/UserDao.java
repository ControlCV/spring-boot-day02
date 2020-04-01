package com.zjw.springbootday02.dao.user;

import com.zjw.springbootday02.entities.User;
import org.springframework.stereotype.Repository;

/**
 * @author zhjw
 * @date 2020-03-30 13:50
 */
@Repository
public interface UserDao {
     User queryByUserName(User user);
}
