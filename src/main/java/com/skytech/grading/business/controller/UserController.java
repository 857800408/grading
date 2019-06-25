package com.skytech.grading.business.controller;

import com.skytech.grading.business.domain.ResponseBean;
import com.skytech.grading.business.domain.User;
import com.skytech.grading.business.service.UserService;
import com.skytech.grading.business.util.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/5/3 11:23
 * @Created by huangdasheng
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/list")
    //前后端分离 shiro权限拦截无效
    @RequiresPermissions(value = "queryUser")
    public PageHelper getUserList(PageHelper pageHelper) throws Exception{
        PageHelper userList = userService.getUserList(pageHelper);
        return userList;
    }

    /*添加用户*/
    @RequestMapping(value = "/user/addUser",method = RequestMethod.POST)
    //@RequiresPermissions(value = "addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/user/delUser",method = RequestMethod.GET)
    //@RequiresPermissions(value = "delUser")
    public void delUser(@RequestParam("id") String id){
        userService.delUser(id);
    }

    @RequestMapping(value = "/user/updateUser",method = RequestMethod.POST)
    public void updateUser(@RequestBody User user){
        log.info(user.toString());
        userService.updateUser(user);
    }

    /*查询个人用户*/
    @RequiresPermissions(value = "queryUser")
    @RequestMapping(value = "/user/getPersonal",method = RequestMethod.GET)
    public User getPersonal(HttpServletRequest request){
        return userService.getPersonal(request);
    }


}
