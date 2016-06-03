package com.vincent.study.dao;

import com.vincent.study.model.User;
import org.springframework.stereotype.Repository;

/**
 * 用户 Dao
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
@Repository
public class UserDao extends BaseDao {

    public void saveUser(User user) {

        sqlSession().insert("userMapper.saveUser", user);

    }
}
