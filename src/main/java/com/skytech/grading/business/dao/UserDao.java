package com.skytech.grading.business.dao;


import com.skytech.grading.business.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Classname UserDao.xml
 * @Description TODO
 * @Date 2019/4/28 19:56
 * @Created by huangdasheng
 */
@Repository
public interface UserDao{
    //获取密码
    public User getUser(String username);
    //获取权限
    public User getUserRole(String username) throws Exception;

    List<User> getUserByPage(int page,int limit) throws Exception;

    void addUser(User user)  throws Exception;

    void delUser(String id) throws  Exception;

    void updateUser(User user) throws Exception;
}
