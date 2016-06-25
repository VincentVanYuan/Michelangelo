package com.vincent.study.dao;

import com.vincent.study.model.Family;
import org.springframework.stereotype.Repository;

/**
 * 家人 Dao
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-25
 */
@Repository
public class FamilyDao extends BaseDao {

    public Long saveFamily(Family family) {
        sqlSession.insert("familyMapper.saveFamily", family);
        return family.getFamilyId();
    }

}
