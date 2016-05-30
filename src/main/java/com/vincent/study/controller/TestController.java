package com.vincent.study.controller;

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

    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }
}
