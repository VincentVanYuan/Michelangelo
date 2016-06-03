package com.vincent.study.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;

/**
 * BaseDao
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
public class BaseDao {

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public SqlSession sqlSession() {

        return this.sqlSessionFactory.openSession();

    }

}
