package com.vincent.study.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 测试 main
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-5-28
 */
public class TestInMain {

    private static final Logger logger = LogManager.getLogger(TestInMain.class);

    public static void main(String[] args) {

        logger.info(Season.SPRING);
        logger.info(Season.SUMMER);
        logger.info(Season.AUTUMN);
        logger.info(Season.WINTER);

        logger.info(Animals.horse.toString());
        logger.info(Animals.stallion.toString());
        logger.info(Animals.monkey.toString());
        logger.info(Animals.gorilla.toString());

    }

    private enum Season {

        SPRING, SUMMER, AUTUMN, WINTER

    }

    private enum Animals {

        horse("马", 1), stallion("雄马", 2), monkey("猴子", 3), gorilla("大猩猩", 4);

        private String name;
        private int index;

        Animals(String name, int index) {
            this.name = name;
            this.index = index;
        }

        @Override
        public String toString() {
            return getName() + " ---> " + getIndex();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

}
