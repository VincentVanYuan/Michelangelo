package com.vincent.study.test;

import com.vincent.study.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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

    private static final Logger logger = LogManager.getLogger(TestBeanInMain.class);

    private static final ClassPathResource resource = new ClassPathResource("test/test-bean.xml");

    public static void main(String[] args) {

        User user = getUserByBeanFactory();
        //User user = getUserByDefault();

        logger.info("\n" + user.getUserId() + "\n" + user.getUserName() + "\n" + user.getUserAvatar() + "\n" + user.getUserAge() + "\n" + user.getUserBirth());

    }

    private static User getUserByBeanFactory() {
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        return beanFactory.getBean("user", User.class);
    }

    private static User getUserByDefault() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        return factory.getBean("user", User.class);
    }
    
}
