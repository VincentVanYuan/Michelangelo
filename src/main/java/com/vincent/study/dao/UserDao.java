package com.vincent.study.dao;

import com.vincent.study.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

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

        sqlSession.insert("userMapper.saveUser", user);

    }

    public User getUserObjByUserId(String userId) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        parameter.put("userId", userId);
        return sqlSession.selectOne("userMapper.getUserObjByUserId", parameter);
    }
}
