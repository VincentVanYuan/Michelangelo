package com.vincent.study.service;

import com.vincent.study.dao.FamilyDao;
import com.vincent.study.model.Family;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 家人 Service
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-25
 */
@Service
public class FamilyService {

    private static final Logger logger = LogManager.getLogger(FamilyService.class);

    @Autowired
    private FamilyDao familyDao;

    public void saveFamily(Family family) {
        familyDao.saveFamily(family);
    }
}
