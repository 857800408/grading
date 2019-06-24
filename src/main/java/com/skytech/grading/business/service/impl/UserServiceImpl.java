package com.skytech.grading.business.service.impl;

import com.skytech.grading.business.dao.UserDao;
import com.skytech.grading.business.domain.User;
import com.skytech.grading.business.service.UserService;
import com.skytech.grading.business.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/5/3 12:09
 * @Created by huangdasheng
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public PageHelper getUserList(PageHelper pageHelper) {
        try {
            if(pageHelper.getPage()<=0){
                pageHelper.setPage(1);
            }

            List<User> list =userDao.getUserByPage(pageHelper.getPage(),pageHelper.getLimit());
            pageHelper.setList(list);
        }catch (Exception e){
            e.printStackTrace();
        }

        return pageHelper;
    }

    @Override
    public void addUser(User user) {
        try {
            System.out.println("12"+user);
            userDao.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
        }

    }

    @Override
    public void delUser(String id) {
        try {
            userDao.delUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            userDao.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
        }
    }
}
