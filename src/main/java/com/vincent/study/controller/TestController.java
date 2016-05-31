package com.vincent.study.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试 Controller
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-5-28
 */
@Controller
public class TestController {

    private static final Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.debug("hello");
        logger.info("hello");
        logger.warn("hello");
        logger.error("hello");
        return "index";
    }
}
