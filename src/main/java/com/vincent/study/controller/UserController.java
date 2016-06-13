package com.vincent.study.controller;

import com.vincent.study.model.User;
import com.vincent.study.service.UserService;
import com.vincent.study.utils.GenerateId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 用户 Controller
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
@Controller
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/saveUser")
    public String saveUser() {
        try {
            User user = new User();
            user.setUserId(GenerateId.currentTimeMillis());
            user.setUserName("Vincent");
            user.setUserAge(23);
            user.setUserBirth(new Date());
            user.setUserAvatar("///////////////////////");
            userService.saveUser(user);
            logger.info("save success");
        } catch (Exception e) {
            logger.error(e);
        }
        return "index";
    }
}
