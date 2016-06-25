package com.vincent.study.controller;

import com.vincent.study.model.User;
import com.vincent.study.service.UserService;
import com.vincent.study.utils.GenerateId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * 用户 Controller
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     *
     * @param userName   用户名
     * @param userAge    年龄
     * @param userBirth  出生日期
     * @param userAvatar 头像
     * @return user model
     * @since 2016-6-1
     */
    @RequestMapping(value = "saveUser", method = RequestMethod.GET)
    public String saveUser(@RequestParam(value = "userName") String userName,
                           @RequestParam(value = "userAge", required = false) Integer userAge,
                           @RequestParam(value = "userBirth", required = false) @DateTimeFormat(pattern = "yy-MM-dd") Date userBirth,
                           @RequestParam(value = "userAvatar", required = false) String userAvatar,
                           Model model) {

        try {
            User user = new User();
            user.setUserId(GenerateId.currentTimeMillis());
            user.setUserName(userName);
            user.setUserAge(userAge);
            user.setUserBirth(userBirth);
            user.setUserAvatar(userAvatar);
            userService.saveUser(user);
            model.addAttribute(user);
            logger.info("save success!");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return "index";
    }
}
