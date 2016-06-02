package com.vincent.study.dao;

import com.vincent.study.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 用户 Dao
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
@Repository
public class UserDao {

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public void saveUser(User user) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.insert("userMapper.saveUser", user);

        sqlSession.commit();

        sqlSession.close();
    }
}
