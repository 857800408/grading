package com.skytech.grading.business.controller;

import com.skytech.grading.business.dao.UserDao;
import com.skytech.grading.business.domain.User;
import com.skytech.grading.business.service.LoginService;
import com.skytech.grading.config.util.JWTUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2019/4/30 9:42
 * @Created by huangdasheng
 */

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {


    @Autowired
    private LoginService loginService;

    @Autowired
    private UserDao userDao;
    /**
    *@Description: 登录
    *@Param:
    *@return:
    *@Author: huangdasheng
    *@date: 2019/4/30
    */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(@RequestBody User user, HttpServletResponse response) throws Exception {
        Map<String,String> hashMap = new HashMap<>();
        try{
            Object login = loginService.login(user.getId(), user.getPassword());
            if(login instanceof User){
                User userRole  = (User)login;

            if(!userRole.getPassword().equals(new SimpleHash("MD5", user.getPassword(), null, 1024).toString())){
                hashMap.put("success","false");
            }else {
                hashMap.put("success","true");
                //报错：：NoClassDefFoundError  类对于类加载器来说，是不可见的，这就是为什么报错。
                //hashMap.put("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1NTcxMzk3ODUsInVzZXJuYW1lIjoiMjQzMCJ9.-9GMSETXkrtadIaE-w8iemMXwqbpxAt_MHiatg-UPX8");
                //参考 --》 https://www.cnblogs.com/xyhz0310/p/6803950.html
                //要使用权限类名
                //hashMap.put("token", com.skytech.grading.config.util.JWTUtil.sign(user.getId(), user.getPassword()));
                //存在cookie里面相对安全
                //注意这里必须要用加密的密码做密钥
                Cookie cookie = new Cookie("access_token", com.skytech.grading.config.util.JWTUtil.sign(user.getId(), userRole.getPassword()));
                response.addCookie(cookie);
            }
            }
            return hashMap;
        }catch (Exception e){
            e.printStackTrace();
            throw new UnauthorizedException();
        }

    }
}
