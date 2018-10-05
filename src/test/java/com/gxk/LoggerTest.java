package com.gxk;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述:
 * @author Danger
 * @create 2018-09-30 16:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@Data
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() {
        String name = "test";
        String password = "123456";
        log.debug("debug...");
        log.info("info...");
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
    }
}
