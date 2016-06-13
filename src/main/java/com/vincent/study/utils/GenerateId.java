package com.vincent.study.utils;

import java.util.UUID;

/**
 * 生成ID工具类
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-12
 */
public class GenerateId {

    public static String randomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    public static String currentTimeMillis() {
        return String.valueOf(System.currentTimeMillis());
    }
}
