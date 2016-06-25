package com.vincent.study.controller;

import com.vincent.study.model.Family;
import com.vincent.study.service.FamilyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * 家人 Controller
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-25
 */
@Controller
@RequestMapping("/family")
public class FamilyController {

    private static final Logger logger = LogManager.getLogger(FamilyController.class);

    @Autowired
    private FamilyService familyService;

    /**
     * 添加家人
     *
     * @param familyCall  称呼
     * @param familyName  姓名
     * @param familyAge   年龄
     * @param familyBirth 生日
     * @param userId      用户ID
     * @return family model
     * @since 2016-6-25
     */
    @RequestMapping(value = "saveFamily", method = RequestMethod.GET)
    public String saveFamily(@RequestParam(value = "familyCall") String familyCall,
                             @RequestParam(value = "familyName") String familyName,
                             @RequestParam(value = "familyAge", required = false) Integer familyAge,
                             @RequestParam(value = "familyBirth", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date familyBirth,
                             @RequestParam(value = "userId") String userId,
                             Model model) {

        try {
            Family family = new Family();
            family.setUserId(userId);
            family.setFamilyAddTime(new Date());
            family.setFamilyAge(familyAge);
            family.setFamilyBirth(familyBirth);
            family.setFamilyCall(familyCall);
            family.setFamilyName(familyName);
            Long familyId = familyService.saveFamily(family);
            family.setFamilyId(familyId);
            model.addAttribute(family);
            logger.info("save success!");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return "family";
    }

}