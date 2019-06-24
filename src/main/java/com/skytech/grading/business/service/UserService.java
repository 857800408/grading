package com.skytech.grading.business.service;

import com.skytech.grading.business.domain.User;
import com.skytech.grading.business.util.PageHelper;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/5/3 12:09
 * @Created by huangdasheng
 */
public interface UserService {


    public PageHelper getUserList(PageHelper pageHelper);

    void addUser(User user);

    void delUser(String id);

    void updateUser(User user);
}
