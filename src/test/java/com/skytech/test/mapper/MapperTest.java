package com.skytech.test.mapper;

import com.skytech.grading.App;

import com.skytech.grading.business.dao.UserDao;
import com.skytech.grading.business.domain.User;
import com.skytech.grading.config.util.JWTUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname MapperTest
 * @Description TODO
 * @Date 2019/4/29 9:36
 * @Created by huangdasheng
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MapperTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelect() {
        String sign = JWTUtil.sign("2430", "12345");
        System.out.println(sign);
    }
}
