package com.vincent.study.test;

import com.vincent.study.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试 Bean
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-5-28
 */
public class TestBeanInMain {

    private static final Logger logger = LogManager.getLogger(TestEnumInMain.class);

    public static void main(String[] args) {

        ClassPathResource resource = new ClassPathResource("test/test-bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        User user = beanFactory.getBean("user", User.class);
        logger.info("\n" + user.getUserId() + "\n" + user.getUserName() + "\n" + user.getUserAvatar() + "\n" + user.getUserAge() + "\n" + user.getUserBirth());

    }
}
