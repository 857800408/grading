package com.skytech.grading.business.controller;

import com.skytech.grading.business.domain.User;
import com.skytech.grading.business.service.UserService;
import com.skytech.grading.business.util.PageHelper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/5/3 11:23
 * @Created by huangdasheng
 */
@RestController
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
    //前后端分离 shiro权限拦截无效
    //@RequiresPermissions(value = "addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/user/delUser",method = RequestMethod.GET)
    //前后端分离 shiro权限拦截无效
    //@RequiresPermissions(value = "delUser")
    public void delUser(@RequestParam("id") String id){
        userService.delUser(id);
    }

    @RequestMapping(value = "/user/updateUser",method = RequestMethod.POST)
    //前后端分离 shiro权限拦截无效
        //@RequiresPermissions(value = "delUser")
    public void delUser(@RequestBody User user){
        userService.updateUser(user);
    }

}
