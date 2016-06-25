package com.vincent.study.service;

import com.vincent.study.dao.UserDao;
import com.vincent.study.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户 Service
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
@Service
public class UserService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User getUserObjByUserId(String userId) {
        return userDao.getUserObjByUserId(userId);
    }
}
