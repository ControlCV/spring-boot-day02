package com.zjw.springbootday02;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDay02ApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        //日志的级别，由低到高
        logger.trace("这是trace");
        logger.debug("这是debug");

        //springboot默认使用的是info级别的
        logger.info("这是info");
        logger.warn("这是warn");
        logger.error("这是error");
    }

}
