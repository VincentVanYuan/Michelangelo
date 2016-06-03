package com.vincent.study.dao;

import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;

/**
 * BaseDao
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
public class BaseDao {

    @Resource(name = "sqlSession")
    protected SqlSession sqlSession;

}
