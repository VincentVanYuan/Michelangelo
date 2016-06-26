package com.vincent.study.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试 Map
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-21
 */
public class TestMapInMain {

    private static final Logger logger = LogManager.getLogger(TestMapInMain.class);

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "5");
        map.put("f", "6");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            logger.info(entry.getKey() + "--->" + entry.getValue());
        }

        Set set = map.entrySet();
        for (Object aSet : set) {
            Map.Entry<String, String> entry1 = (Map.Entry<String, String>) aSet;
            logger.info(entry1.getKey() + "==" + entry1.getValue());
        }

        for (Object o : map.keySet()) {
            String key;
            String value;
            key = o.toString();
            value = map.get(key);
            logger.info(key + "--" + value);
        }

        Iterator it = map.entrySet().iterator();
        String key;
        String value;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = entry.getKey().toString();
            value = entry.getValue().toString();
            logger.info(key + "====" + value);
        }
    }
}
